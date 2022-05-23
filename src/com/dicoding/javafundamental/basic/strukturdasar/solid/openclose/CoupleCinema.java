package com.dicoding.javafundamental.basic.strukturdasar.solid.openclose;

public class CoupleCinema extends Cinema {

    public CoupleCinema(Double price) {
        super(price);
    }

    public CoupleCinema() {
    }

    @Override
    double calculateAdminFee() {
        return price * 15 / 100;
    }
}
