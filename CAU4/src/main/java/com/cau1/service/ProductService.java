package com.cau1.service;

import com.cau1.entity.Product;

import java.util.List;

public interface ProductService {

    //add product
    public Product addProduct(Product product);

    //getAllProduct
    public List<Product> getAllProduct();

}
