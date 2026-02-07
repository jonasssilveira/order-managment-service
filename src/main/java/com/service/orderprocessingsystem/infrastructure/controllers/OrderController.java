package com.service.orderprocessingsystem.infrastructure.controllers;

import com.service.orderprocessingsystem.infrastructure.controllers.dto.OrderDTO;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("v1")
public class OrderController {

    @PostMapping
    public ResponseEntity<Map<String, String>> createOrder(@RequestBody OrderDTO orderDTO) {
        System.out.println(orderDTO);
        return ResponseEntity.ok(Map.of("status", "CREATED"));
    }
}
