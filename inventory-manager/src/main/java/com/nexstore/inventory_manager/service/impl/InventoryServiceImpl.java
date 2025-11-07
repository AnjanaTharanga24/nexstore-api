package com.nexstore.inventory_manager.service.impl;

import com.nexstore.inventory_manager.model.Inventory;
import com.nexstore.inventory_manager.repository.InventoryRepository;
import com.nexstore.inventory_manager.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private InventoryRepository inventoryRepository;

    @Override
    public List<Inventory> getAllItems() {

        List<Inventory> items = inventoryRepository.findAll();
        return items;
    }

    @Override
    public Inventory saveItem(Inventory item) {
        Inventory inventory = new Inventory();
        inventory.setQuantity(item.getQuantity());
        inventory.setItemId(item.getItemId());
        inventory.setProductId(item.getProductId());

        Inventory savedItem = inventoryRepository.save(inventory);
        return savedItem;
    }

    @Override
    public Inventory updateItem(int id ,Inventory item) {
        Optional<Inventory> foundItem = inventoryRepository.findById(id);
        if (!foundItem.isPresent()) {
            return null;
        }

        Inventory savedItem = foundItem.get();
        savedItem.setQuantity(item.getQuantity());
        savedItem.setItemId(item.getItemId());
        savedItem.setProductId(item.getProductId());

        return savedItem;
    }

    @Override
    public String deleteItem(int id) {
        Optional<Inventory> foundItem = inventoryRepository.findById(id);
        if (!foundItem.isPresent()) {
            return "Item with id " + id + " not found";
        }

        inventoryRepository.deleteById(id);
        return "deleted item with id " + id;
    }

    @Override
    public Inventory findById(int id) {
        Optional<Inventory> foundItem = inventoryRepository.findById(id);
        if (!foundItem.isPresent()) {
            return null;
        }
        Inventory item = foundItem.get();
        return item;
    }
}
