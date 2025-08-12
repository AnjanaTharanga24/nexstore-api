package com.nexstore.product_manager;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagerApplication.class, args);
	}

	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
