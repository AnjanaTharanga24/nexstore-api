package com.nexstore.product_manager.service;

import com.nexstore.product_manager.dto.ProductDTO;
import com.nexstore.product_manager.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product saveProduct(ProductDTO productDTO);
    Product updateProduct(ProductDTO productDTO);
    String deleteProduct(int id);
    Product getProductById(int id);

}
