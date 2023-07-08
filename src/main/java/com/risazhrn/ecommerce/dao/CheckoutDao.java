package com.risazhrn.ecommerce.dao;

public class CheckoutDao {
    int total;
    
    DataBarang[] dataBarang;
    public CheckoutDao(int total, DataBarang[] dataBarang) {
        this.total = total;
        this.dataBarang = dataBarang;
    }
    public int getTotal() {
        return total;
    }
    public DataBarang[] getDataBarang() {
        return dataBarang;
    }

    
}
