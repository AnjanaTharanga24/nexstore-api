package com.nexstore.order_manager;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrderManagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(OrderManagerApplication.class, args);

	}

	@Bean
	public ModelMapper modelMapper () {
		return new ModelMapper();
	}
}
