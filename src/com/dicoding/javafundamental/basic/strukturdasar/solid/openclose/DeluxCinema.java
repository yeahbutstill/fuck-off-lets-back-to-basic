package com.dicoding.javafundamental.basic.strukturdasar.solid.openclose;

public class DeluxCinema extends Cinema {
    public DeluxCinema(Double price) {
        super(price);
    }

    public DeluxCinema() {
    }

    @Override
    double calculateAdminFee() {
        return price * 12 / 100;
    }
}
