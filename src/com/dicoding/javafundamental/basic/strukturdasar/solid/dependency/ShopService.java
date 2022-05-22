package com.dicoding.javafundamental.basic.strukturdasar.solid.dependency;

public class ShopService {
    private String price;
    private Product product;

    public ShopService(String price, Product product) {
        this.price = price;
        this.product = product;
    }

    public ShopService() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
