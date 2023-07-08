package com.risazhrn.ecommerce.dao;

public class DataBarang {
    int id;
    int quantity;
    
    public DataBarang(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    
}
