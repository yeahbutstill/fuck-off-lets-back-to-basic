package com.dicoding.javafundamental.basic.strukturdasar.solid.srp;

public class OrderViewer {

    private Order order;

    void printOrder(Order order) {
        this.order = order;
    }

    void showOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderViewer{" +
                "order=" + order +
                '}';
    }
}