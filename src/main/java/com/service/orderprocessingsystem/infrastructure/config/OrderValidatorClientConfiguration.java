package com.service.orderprocessingsystem.infrastructure.config;

import feign.Retryer;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderValidatorClientConfiguration {

    @Bean
    public Retryer retryer(){
        return new OrderValidatorRetryer();
    }

    @Bean
    public ErrorDecoder errorDecoder(){
        return new OrderValidatorErrorDecoder();
    }
}
