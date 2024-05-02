package com.tij4awesome.chapter1;

public class Penguin extends Bird {
    @Override
    void move() {
        super.move();
        System.out.println("Penguin move...");
    }
}
