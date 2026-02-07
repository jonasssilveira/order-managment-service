package com.service.orderprocessingsystem.infrastructure.controllers.dto;

import com.sun.istack.NotNull;

public record ProductDTO(
    @NotNull Long id,
    @NotNull Integer quantity
) {
}
