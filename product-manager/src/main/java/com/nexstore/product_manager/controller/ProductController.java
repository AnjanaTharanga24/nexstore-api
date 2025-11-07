package com.nexstore.product_manager.controller;

import com.nexstore.product_manager.dto.ProductDTO;
import com.nexstore.product_manager.model.Product;
import com.nexstore.product_manager.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/order")
public class ProductController {

    private ProductService productService;

    @PostMapping
    public Product save(ProductDTO productDTO) {
        return productService.saveProduct(productDTO);
    }

    @PutMapping
    public Product updateProduct(ProductDTO productDTO) {
        return productService.updateProduct(productDTO);
    }

    @DeleteMapping("id")
    public String deleteProduct(@PathVariable("id") int id) {
        return productService.deleteProduct(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/id")
    public Product getProductById(@PathVariable("id")int id) {
        return productService.getProductById(id);
    }
}
