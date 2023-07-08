package com.risazhrn.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.risazhrn.ecommerce.entity.Product;
import com.risazhrn.ecommerce.services.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    public Product add(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/detail/{id}")
    public String detailById(@PathVariable("id") int id, Model model){
        model.addAttribute("product", productService.findOne(id));
        return "detail";
    }

    
}
