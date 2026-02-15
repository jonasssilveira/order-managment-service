package com.service.orderprocessingsystem.domain.repository;

import com.service.orderprocessingsystem.domain.model.entity.OrdersProducts;
import java.util.List;

public interface OrdersProductsRepository {
    List<OrdersProducts> getOrdersProducts(Long orderId);
}
