package com.dicoding.javafundamental.basic.strukturdasar.solid.srp;

public class Order {

    private Item item;

    void calculateTotalSum() {
    }

    void getItems() {
    }

    void getItemCount() {
    }

    void addItem(Item item) {
        this.item = item;
    }

    void deleteItem(Item item) {
    }

    @Override
    public String toString() {
        return "Order{" +
                "item=" + item +
                '}';
    }
}