package com.dicoding.javafundamental.basic.strukturdasar.solid.nosolid.lsp;

import org.joda.time.DateTime;

public class Vegetable extends Product {

    @Override
    String setName() {
        return "Broccoli";
    }

    @Override
    DateTime setExpiredDate() {
        return new DateTime();
    }
}
