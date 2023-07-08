package com.risazhrn.ecommerce.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="transaction")
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "transaction")
    private Set<ProductTransaction> products;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    public Transaction(Set<ProductTransaction> products, LocalDateTime createdAt) {
        this.products = products;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public Set<ProductTransaction> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductTransaction> products) {
        this.products = products;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
