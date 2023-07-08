package com.risazhrn.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.risazhrn.ecommerce.entity.ProductTransaction;
import com.risazhrn.ecommerce.repos.ProductTransactionRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductTransactionService {
    
    @Autowired
    private ProductTransactionRepo productTransactionRepo;

    public ProductTransaction save(ProductTransaction productTransaction){
        return productTransactionRepo.save(productTransaction);
    }

}
