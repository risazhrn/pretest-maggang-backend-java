package com.risazhrn.ecommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.risazhrn.ecommerce.entity.Product;
import com.risazhrn.ecommerce.repos.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product){
        return productRepo.save(product);
    }

    public Product findOne(int id){
        return productRepo.findById(id).get();
    }

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }
    
    public void removeOne(int id){
        productRepo.deleteById(id);
    }
    // private static List<Product> products = new ArrayList<Product>(){
    //     {    
    //     add(new Product(1L, "001", "Product 001", 10000.0));
    //     add(new Product(2L, "002", "Product 002", 20000.0));
    //     add(new Product(3L, "003", "Product 003", 30000.0));
    //     add(new Product(4L, "004", "Product 004", 40000.0));
    //     add(new Product(5L, "005", "Product 005", 50000.0));
    // }};

    // public List<Product> findAll(){
    //     return products;
    // }

    // public void addProduct(Product product){
    //     product.setId(products.size()+1L);
    //     products.add(product);
    // }

    // public void deleteById(Long id){
    //     products.removeIf(p ->  p.getId() == id);
    // }

    // public Optional<Product> findById(Long id){
    //     return products.stream().filter(p -> p.getId() == id).findFirst();
    // }

    // public void updateProduct(Product product){
    //     deleteById(product.getId());
    //     products.add(product);
    // }


    
}
