package com.risazhrn.ecommerce.repos;

import org.springframework.data.repository.CrudRepository;

import com.risazhrn.ecommerce.entity.ProductTransaction;

public interface ProductTransactionRepo extends CrudRepository<ProductTransaction, Integer>  {
    
}
