package com.dicoding.javafundamental.basic.strukturdasar.solid.openclose;

public abstract class Cinema {

    public Double price;

    public Cinema(Double price) {
        this.price = price;
    }

    public Cinema() {
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    abstract double calculateAdminFee();
}
