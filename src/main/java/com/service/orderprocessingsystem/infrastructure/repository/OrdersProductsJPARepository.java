package com.service.orderprocessingsystem.infrastructure.repository;

import com.service.orderprocessingsystem.domain.model.entity.OrdersProducts;
import com.service.orderprocessingsystem.domain.repository.OrdersProductsRepository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersProductsJPARepository extends JpaRepository<OrdersProducts, Long>, OrdersProductsRepository {
    List<OrdersProducts> getOrdersProducts(Long orderId);
}
