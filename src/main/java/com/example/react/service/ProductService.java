package com.example.react.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.react.model.Vendor;
import com.example.react.repository.ProductRepository;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Vendor> getAllProducts() {
        return productRepository.findAll();
    }
    public Vendor getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
    public void addProduct(Vendor product) {
        productRepository.save(product);
    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);   
    }
}
