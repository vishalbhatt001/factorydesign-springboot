package com.example.demo;

import com.example.factory.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
   @Autowired
	PaymentService paymentService;

	@Test
	void factoryTest() {
		paymentService.processPayment("Stripe", 345);
	}

}
