package com.service.orderprocessingsystem.domain.repository;

import com.service.orderprocessingsystem.domain.model.entity.Product;
import java.util.Optional;

public interface ProductRepository {
    Optional<Product> getProductById(Long productId);
    Optional<Product> getProductByName(String productName);
    void saveProduct(Product product);
}
