package com.risazhrn.ecommerce.repos;

import org.springframework.data.repository.CrudRepository;
import com.risazhrn.ecommerce.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Integer>{
    
}
