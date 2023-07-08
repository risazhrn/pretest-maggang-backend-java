package com.risazhrn.ecommerce.entity;

import java.io.Serializable;
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
    private String url_image;

    public Product(int id, String name, String description, double price, int stock, String url_image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.url_image = url_image;
    }

    
    public Product() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return url_image;
    }

    public void setUrlImage(String url_image) {
        this.url_image = url_image;
    }

    
    


}
