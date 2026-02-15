package com.service.orderprocessingsystem.infrastructure.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ErrorResponse extends Exception {
    private String message;
    private HttpStatus status;
    private String prefix;
}
