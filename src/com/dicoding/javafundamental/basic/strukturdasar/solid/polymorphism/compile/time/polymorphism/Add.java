package com.dicoding.javafundamental.basic.strukturdasar.solid.polymorphism.compile.time.polymorphism;

public class Add extends Arithmetic {

    @Override
    public int add(int valueA, int valueB) {
        return super.add(valueA, valueB);
    }

    @Override
    public long add(long valueA, long valueB) {
        return super.add(valueA, valueB);
    }

    @Override
    public long add(int valueA, long valueB) {
        return super.add(valueA, valueB);
    }

    @Override
    public long add(long valueA, int valueB) {
        return super.add(valueA, valueB);
    }

}
