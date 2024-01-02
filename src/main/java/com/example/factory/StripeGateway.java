package com.example.factory;

import org.springframework.stereotype.Service;

@Service("StripeGateway")
public class StripeGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}
