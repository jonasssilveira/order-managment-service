package com.order.validation.ordervalidation.infrastructure.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/order")
public class OrderValidationController {
    private static Map<Boolean, Map<String, String>>  map = new HashMap<>();
    static {
        map.put(true, generateSuccessMap());
        map.put(false, generateErrorMap());
    }

    @PostMapping("/validation")
    public ResponseEntity<?> validateOrder() {
        Random rand  = new Random();
        int result = rand.nextInt(1, 101);
        return ResponseEntity.ok().body(map.get(result % 2 == 0));
    }

    private static HashMap<String, String> generateSuccessMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    private static HashMap<String, String> generateErrorMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "error");
        return map;
    }

}
