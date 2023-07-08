package com.risazhrn.ecommerce.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.risazhrn.ecommerce.dao.CheckoutDao;
import com.risazhrn.ecommerce.dao.DataBarang;
import com.risazhrn.ecommerce.entity.Product;
import com.risazhrn.ecommerce.entity.ProductTransaction;
import com.risazhrn.ecommerce.entity.Transaction;
import com.risazhrn.ecommerce.services.ProductService;
import com.risazhrn.ecommerce.services.ProductTransactionService;
import com.risazhrn.ecommerce.services.TransactionService;

@RestController
@RequestMapping("/api")
public class ApiController {
    
    @Autowired
    private ProductService productService;
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private ProductTransactionService productTransactionService;

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable("id") int id) {
        return productService.findOne(id);
    }

    @PostMapping("/checkout")
    public Transaction checkOut(@RequestBody CheckoutDao requestData) {
        Transaction transaction = transactionService.save(new Transaction(requestData.getTotal(), LocalDateTime.now()));

        for(DataBarang dataBarang : requestData.getDataBarang()) {
            Product product = productService.findOne(dataBarang.getId());
            ProductTransaction pt = productTransactionService.save(new ProductTransaction(transaction, product, dataBarang.getQuantity()));
        }

        return transaction;
    }
    
}
