package com.cau2.controller;

import com.cau2.entity.Product;
import com.cau2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    //api add product
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    //api get all
    @GetMapping("/list")
    public List<Product> getAllEmployee(){
        return productService.getAllProduct();
    }


}
