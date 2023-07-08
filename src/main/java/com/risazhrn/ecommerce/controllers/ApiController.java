package com.risazhrn.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.risazhrn.ecommerce.entity.Product;
import com.risazhrn.ecommerce.services.ProductService;

@RestController
@RequestMapping("/api")
public class ApiController {
    
    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productService.findOne(id).get();
    }
    
}
