package com.service.orderprocessingsystem.domain.usecase;

import com.service.orderprocessingsystem.domain.model.entity.OrdersProducts;

public interface Validator {
    boolean isValid(OrdersProducts ordersProducts);
}
