package com.nexstore.product_manager.repository;

import com.nexstore.product_manager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
