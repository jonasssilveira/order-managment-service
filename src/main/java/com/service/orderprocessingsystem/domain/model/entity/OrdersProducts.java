package com.service.orderprocessingsystem.domain.model.entity;

import jakarta.persistence.Entity;

@Entity
public record OrdersProducts(
    Long products_id,
    Long orders_id,
    Integer quantity) {
}
