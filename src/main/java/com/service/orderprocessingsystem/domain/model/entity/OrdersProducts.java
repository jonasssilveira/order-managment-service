package com.service.orderprocessingsystem.domain.model.entity;

import jakarta.persistence.Entity;

@Entity
public record OrdersProducts(
    Long productsId,
    Long ordersId,
    Integer quantity) {
}
