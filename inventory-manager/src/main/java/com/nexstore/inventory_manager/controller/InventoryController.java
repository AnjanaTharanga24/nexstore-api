package com.nexstore.inventory_manager.controller;

import com.nexstore.inventory_manager.model.Inventory;
import com.nexstore.inventory_manager.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/order")
public class InventoryController {

    private InventoryService inventoryService;

    @PostMapping
    public Inventory save(@RequestBody Inventory item) {
        return inventoryService.saveItem(item);
    }

    @GetMapping("/id")
    public Inventory getByInventoryId(@PathVariable("id") int id) {
        return inventoryService.findById(id);
    }

    @GetMapping
    public List<Inventory> getAllInventory(){
        return inventoryService.getAllItems();
    }

    @PutMapping("/id")
    public Inventory updateInventory(@PathVariable("id") int id ,@RequestBody Inventory item) {
        return inventoryService.updateItem(id,item);
    }

    @DeleteMapping("/id")
    public String deleteInventory(@PathVariable("id") int id) {
       return inventoryService.deleteItem(id);
    }

}
