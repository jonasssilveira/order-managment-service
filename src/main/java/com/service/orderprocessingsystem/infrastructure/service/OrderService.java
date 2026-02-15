package com.service.orderprocessingsystem.infrastructure.service;

import com.service.orderprocessingsystem.domain.model.entity.OrdersProducts;
import com.service.orderprocessingsystem.domain.repository.OrderRepository;
import com.service.orderprocessingsystem.domain.repository.OrdersProductsRepository;
import com.service.orderprocessingsystem.domain.usecase.ValidateOrder;
import com.service.orderprocessingsystem.infrastructure.dto.OrderDTO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrdersProductsRepository ordersProductsRepository;
    private final ValidateOrder validateOrder;
    private final CheckValidation checkValidation;

    public OrderDTO getOrder(Long orderId) {
        List<OrdersProducts> ordersProducts = ordersProductsRepository.getOrdersProducts(orderId);
        return orderRepository.getOrderById(orderId)
            .map(order -> OrderDTO.fromEntity(order, ordersProducts))
            .orElseThrow(() -> new RuntimeException("Order with id " + orderId + " not found"));
    }

    public void createOrder(OrderDTO orderDTO) {
        //TODO validar a order
        // 1. product quantity - order.productquantity > 0
        // transactionService = success criar servico simples que retorna
        var maybeProduct = orderDTO.productsDTO()
            .stream()
            .filter(p -> validateOrder.isValid(new OrdersProducts(p.id(), null, p.quantity())))
            .findAny()
            .orElseThrow(() -> new RuntimeException("Product or quantity invalid"));
        var isValid = checkValidation.checkOrderValidation();
        if(!isValid.getOrDefault("status", false)){
            throw new RuntimeException("Order validation failed");
        }
    }
}
