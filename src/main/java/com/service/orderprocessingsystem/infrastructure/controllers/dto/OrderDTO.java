package com.service.orderprocessingsystem.infrastructure.controllers.dto;

import com.sun.istack.NotNull;
import java.util.List;

public record OrderDTO(
    @NotNull Long userId,
    @NotNull List<ProductDTO> productDTO
    ) {
}
