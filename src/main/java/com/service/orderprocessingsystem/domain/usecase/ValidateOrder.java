package com.service.orderprocessingsystem.domain.usecase;

import com.service.orderprocessingsystem.domain.model.entity.OrdersProducts;
import com.service.orderprocessingsystem.domain.model.entity.Product;
import com.service.orderprocessingsystem.domain.repository.ProductRepository;

public class ValidateOrder implements Validator {
    private final ProductRepository productRepository;

    public ValidateOrder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean isValid(OrdersProducts ordersProducts) {
        Product product = productRepository.getProductById(ordersProducts.productsId())
            .orElseThrow(() -> new RuntimeException("Product not found"));
        return product.quantity() - ordersProducts.quantity() >= 0;
    }
}
