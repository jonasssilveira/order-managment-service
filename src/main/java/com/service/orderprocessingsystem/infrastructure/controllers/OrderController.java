package com.service.orderprocessingsystem.infrastructure.controllers;

import com.service.orderprocessingsystem.infrastructure.dto.OrderDTO;
import com.service.orderprocessingsystem.infrastructure.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("v1")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO) {
        System.out.println(orderDTO);
        orderService.createOrder(orderDTO);
        return ResponseEntity.accepted().build();
    }
}
