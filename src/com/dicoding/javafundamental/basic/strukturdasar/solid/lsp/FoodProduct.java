package com.dicoding.javafundamental.basic.strukturdasar.solid.lsp;

import org.joda.time.DateTime;

public abstract class FoodProduct extends Product {
    abstract DateTime getExpiredDate();
}
