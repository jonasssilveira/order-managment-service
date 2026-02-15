package com.service.orderprocessingsystem.infrastructure.repository;

import com.service.orderprocessingsystem.domain.model.entity.Order;
import com.service.orderprocessingsystem.domain.repository.OrderRepository;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJPARepository extends CrudRepository<Order, Long>, OrderRepository {
    Optional<Order> getOrderById(String orderId);
    void saveOrder(Order order);
}
