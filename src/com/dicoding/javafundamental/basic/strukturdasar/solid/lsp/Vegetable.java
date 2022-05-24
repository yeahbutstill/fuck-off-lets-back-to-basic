package com.dicoding.javafundamental.basic.strukturdasar.solid.lsp;

import org.joda.time.DateTime;

public class Vegetable extends FoodProduct {
    @Override
    DateTime getExpiredDate() {
        return new DateTime();
    }

    @Override
    String getName() {
        return "Broccoli";
    }
}
