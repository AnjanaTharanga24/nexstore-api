package com.nexstore.product_manager.service;

import com.nexstore.product_manager.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();
    ProductDTO saveProduct(ProductDTO productDTO);
    ProductDTO updateProduct(ProductDTO productDTO);
    String deleteProduct();
    ProductDTO getProductById(Integer productId);

}
