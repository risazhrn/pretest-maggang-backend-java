package com.risazhrn.ecommerce.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class ProductTransaction implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    public ProductTransaction(Transaction transaction, Product product, int quantity) {
        this.transaction = transaction;
        this.product = product;
        this.quantity = quantity;
    }

    public ProductTransaction() {
    }

    public int getId() {
        return id;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
