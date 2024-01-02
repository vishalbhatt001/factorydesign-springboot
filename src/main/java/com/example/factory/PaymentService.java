package com.example.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentGatewayFactory paymentGatewayFactory;

    @Autowired
    public PaymentService( PaymentGatewayFactory paymentGatewayFactory) {
        this.paymentGatewayFactory = paymentGatewayFactory;
    }

    public void processPayment(/*@Qualifier("dynamicQualifier")*/ String paymentMethod, double amount) {
        PaymentGateway paymentGateway = paymentGatewayFactory.createPaymentGateway(paymentMethod);
        paymentGateway.processPayment(amount);
    }
}
