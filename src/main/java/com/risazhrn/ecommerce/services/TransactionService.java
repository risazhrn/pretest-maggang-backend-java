package com.risazhrn.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.risazhrn.ecommerce.entity.Transaction;
import com.risazhrn.ecommerce.repos.TransactionRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TransactionService {
    @Autowired
    private TransactionRepo transactionRepo;

    public Transaction save(Transaction transaction) {
        return transactionRepo.save(transaction);
    }

    public Iterable<Transaction> findAll(){
        return transactionRepo.findAll();
    }

    public Transaction findById(int id){
        return transactionRepo.findById(id).get();
    }

}
