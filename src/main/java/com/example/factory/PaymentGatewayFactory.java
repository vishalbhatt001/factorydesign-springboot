package com.example.factory;

import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayFactory {

    public PaymentGateway createPaymentGateway(String paymentMethod) {
        try {
            String className = "com.example.factory." + paymentMethod + "Gateway";
            System.out.println("className **" + className);
            Class<?> gatewayClass = Class.forName(className);
            return (PaymentGateway) gatewayClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid payment method: " + paymentMethod, e);
        }
    }
}
