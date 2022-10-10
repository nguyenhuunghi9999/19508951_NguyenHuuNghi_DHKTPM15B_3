package com.cau1.service;

import com.cau1.entity.Product;
import com.cau1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product addProduct(Product product) {
        if(product != null){
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
