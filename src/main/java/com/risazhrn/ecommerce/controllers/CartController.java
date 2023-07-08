package com.risazhrn.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.risazhrn.ecommerce.services.ProductService;

@Controller
public class CartController {
    @Autowired
    private ProductService productService;

    @GetMapping("/cart")
    public String index() {
        return "cart";
    }

}
