package com.service.orderprocessingsystem.infrastructure.service;

import com.service.orderprocessingsystem.domain.model.entity.OrdersProducts;
import com.service.orderprocessingsystem.infrastructure.config.OrderValidatorClientConfiguration;
import com.service.orderprocessingsystem.infrastructure.dto.OrderDTO;
import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;

@FeignClient(contextId = "checkValiation", name="checkOrderValidation", url = "${configuration.order-checker.feign.url}", configuration = OrderValidatorClientConfiguration.class)
public interface CheckValidation {
    Map<String, Boolean> checkOrderValidation();
}
