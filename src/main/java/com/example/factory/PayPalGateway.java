package com.example.factory;

import org.springframework.stereotype.Service;

@Service("paypalGateway")
public class PayPalGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
