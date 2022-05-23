package com.dicoding.javafundamental.basic.strukturdasar.solid.openclose;

public class StandardCinema extends Cinema {
    public StandardCinema(Double price) {
        super(price);
    }

    public StandardCinema() {
    }

    @Override
    double calculateAdminFee() {
        return price * 10 / 100;
    }
}
