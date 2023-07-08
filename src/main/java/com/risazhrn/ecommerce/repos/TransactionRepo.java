package com.risazhrn.ecommerce.repos;

import org.springframework.data.repository.CrudRepository;

import com.risazhrn.ecommerce.entity.Transaction;

public interface TransactionRepo extends CrudRepository<Transaction, Integer> {
    
}
