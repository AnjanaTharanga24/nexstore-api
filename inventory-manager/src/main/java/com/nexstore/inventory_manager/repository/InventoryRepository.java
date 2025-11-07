package com.nexstore.inventory_manager.repository;

import com.nexstore.inventory_manager.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}
