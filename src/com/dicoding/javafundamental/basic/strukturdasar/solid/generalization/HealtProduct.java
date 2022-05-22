package com.dicoding.javafundamental.basic.strukturdasar.solid.generalization;

public class HealtProduct extends Product {
    public HealtProduct() {
        super();
    }

    public HealtProduct(String name, Long price, Long quantity) {
        super(name, price, quantity);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Long getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(Long price) {
        super.setPrice(price);
    }

    @Override
    public Long getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setQuantity(Long quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
