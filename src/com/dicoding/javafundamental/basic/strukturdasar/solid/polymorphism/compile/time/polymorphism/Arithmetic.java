package com.dicoding.javafundamental.basic.strukturdasar.solid.polymorphism.compile.time.polymorphism;

public class Arithmetic {

    // these overloading
    public int add(int valueA, int valueB) {
        return valueA + valueB;
    }

    public long add(long valueA, long valueB) {
        return valueA + valueB;
    }

    public long add(int valueA, long valueB) {
        return valueA + valueB;
    }

    public long add(long valueA, int valueB) {
        return valueA + valueB;
    }

}
