package com.service.orderprocessingsystem.infrastructure.config;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;

public class OrderValidatorErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        HttpStatus status = HttpStatus.valueOf(response.status());
        return switch (status) {
            case NOT_FOUND -> new ErrorResponse("URL NOT FOUND", HttpStatus.NOT_FOUND, "NOT_FOUND");
            case BAD_REQUEST -> new ErrorResponse("DATA NOT VALID", HttpStatus.BAD_REQUEST, "BAD_REQUEST");
            default -> new ErrorResponse("STATUS NOT MAPPED", status, methodKey);
        };
    }
}
