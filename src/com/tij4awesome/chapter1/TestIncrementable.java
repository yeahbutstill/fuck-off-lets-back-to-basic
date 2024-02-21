package com.tij4awesome.chapter1;

public class TestIncrementable {
    public static void main(String[] args) {
        Incrementable sf1 = new Incrementable();
        Incrementable sf2 = new Incrementable();
        sf1.increment();
        sf2.increment();
        Incrementable.increment();
    }
}
