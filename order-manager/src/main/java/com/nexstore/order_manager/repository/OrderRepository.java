package com.nexstore.order_manager.repository;

import com.nexstore.order_manager.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders,Integer> {
}
