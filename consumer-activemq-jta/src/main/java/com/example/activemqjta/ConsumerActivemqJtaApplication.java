package com.example.activemqjta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ConsumerActivemqJtaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerActivemqJtaApplication.class, args);
	}
}
