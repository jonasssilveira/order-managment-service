package com.service.orderprocessingsystem.domain.repository;

import com.service.orderprocessingsystem.domain.model.entity.Order;
import java.util.Optional;

public interface OrderRepository {
    Optional<Order> getOrderById(Long orderId);
    void saveOrder(Order order);
}
