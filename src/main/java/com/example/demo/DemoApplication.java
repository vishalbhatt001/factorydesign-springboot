package com.example.demo;

import com.example.factory.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class DemoApplication {

	public static void main(String[] args) {
		// Run the Spring Boot application and get the application context
		SpringApplication.run(DemoApplication.class, args);


	}

}
