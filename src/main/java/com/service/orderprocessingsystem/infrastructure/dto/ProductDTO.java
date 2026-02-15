package com.service.orderprocessingsystem.infrastructure.dto;

import org.antlr.v4.runtime.misc.NotNull;

public record ProductDTO(
    @NotNull Long id,
    @NotNull Integer quantity
) {
}
