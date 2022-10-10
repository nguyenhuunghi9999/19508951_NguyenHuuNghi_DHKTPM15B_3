package com.cau2.service;

import com.cau2.entity.Product;

import java.util.List;

public interface ProductService {

    //add product
    public Product addProduct(Product product);

    //getAllProduct
    public List<Product> getAllProduct();

}
