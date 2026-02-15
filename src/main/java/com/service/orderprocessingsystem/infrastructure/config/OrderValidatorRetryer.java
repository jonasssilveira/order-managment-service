package com.service.orderprocessingsystem.infrastructure.config;

import feign.RetryableException;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Value;

public class OrderValidatorRetryer extends Retryer.Default {
    @Value("${configuration.order-checker.feign.threshold}")
    private int threshold;
    @Value("${configuration.order-checker.feign.period}")
    private int period;
    private int actual = 1;

    @Override
    public void continueOrPropagate(RetryableException e) {
        if (++actual > threshold) {
           throw e;
        }
        int status = e.status();
        if (status >= 400 && status <= 499) {
            try {
                Thread.sleep(period);
            }
            catch (InterruptedException ex) {
                throw e;
            }
        }
    }

    @Override
    public Retryer clone() {
        return this.clone();
    }
}
