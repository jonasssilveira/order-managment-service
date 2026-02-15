package com.service.orderprocessingsystem.infrastructure.dto;

import com.service.orderprocessingsystem.domain.model.entity.Order;
import com.service.orderprocessingsystem.domain.model.entity.OrdersProducts;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.misc.NotNull;

public record OrderDTO(
    @NotNull Long userId,
    @NotNull List<ProductDTO> productsDTO
    ) {
    public static OrderDTO fromEntity(Order order, List<OrdersProducts> product) {
        List<ProductDTO> productsDTO = new ArrayList<>();
        product.forEach(p -> productsDTO.add(new ProductDTO(p.productsId(), p.quantity())));
        return new OrderDTO(order.users_id(),productsDTO);
    }
}
