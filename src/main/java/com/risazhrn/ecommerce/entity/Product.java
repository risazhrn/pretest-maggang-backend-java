package com.risazhrn.ecommerce.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="name", length=100)
    private String name;

    @Column(name="description", length=500)
    private String description;

    private double price;
    private int stock;

    @Column(name="url_image")
    private String urlImage;

    @OneToMany(mappedBy = "product")
    Set<ProductTransaction> transactions;

    public Product(String name, String description, double price, int stock, String urlImage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.urlImage = urlImage;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    
}
