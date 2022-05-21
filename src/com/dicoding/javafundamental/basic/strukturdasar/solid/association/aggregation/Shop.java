package com.dicoding.javafundamental.basic.strukturdasar.solid.association.aggregation;

public class Shop {
    private String id;
    private String name;
    private Seller seller;

    public Shop(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
