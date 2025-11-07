package com.nexstore.inventory_manager.service;

import com.nexstore.inventory_manager.model.Inventory;

import java.util.List;

public interface InventoryService {

  List<Inventory> getAllItems();
  Inventory saveItem(Inventory item);
  Inventory updateItem(int id ,Inventory item);
  String deleteItem(int id);
  Inventory findById(int id);
}
