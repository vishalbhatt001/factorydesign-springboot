package com.example.factory;

import org.springframework.stereotype.Service;

@Service("squareGateway")
public class SquareGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Square payment of $" + amount);
    }
}
