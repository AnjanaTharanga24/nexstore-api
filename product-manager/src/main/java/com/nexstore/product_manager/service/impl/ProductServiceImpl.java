package com.nexstore.product_manager.service.impl;

import com.nexstore.product_manager.dto.ProductDTO;
import com.nexstore.product_manager.model.Product;
import com.nexstore.product_manager.repository.ProductRepository;
import com.nexstore.product_manager.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Product saveProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setProductId(productDTO.getProductId());
        product.setProductName(productDTO.getProductName());
        product.setDescription(productDTO.getDescription());
        product.setForSale(productDTO.getForSale());

        productRepository.save(product);

        return product;
    }

    @Override
    public Product updateProduct(ProductDTO productDTO) {
        Optional<Product> product = productRepository.findById(productDTO.getProductId());
        if (!product.isPresent()) {
            return null;
        }

        Product getProduct = product.get();
        getProduct.setProductName(productDTO.getProductName());
        getProduct.setDescription(productDTO.getDescription());
        getProduct.setForSale(productDTO.getForSale());

        return getProduct;

    }

    @Override
    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "deleted";
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        if (!product.isPresent()) {
            return null;
        }

        Product getProduct = product.get();
        return getProduct;
    }
}
