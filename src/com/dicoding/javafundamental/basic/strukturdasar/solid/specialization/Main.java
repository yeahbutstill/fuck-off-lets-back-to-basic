package com.dicoding.javafundamental.basic.strukturdasar.solid.specialization;

import org.joda.time.DateTime;

public class Main {
    public static void main(String[] args) {
        ConsumableProduct consumableProduct = new ConsumableProduct("C1", "A", 100L, DateTime.parse("2234"));
        System.out.println(consumableProduct);
    }
}
