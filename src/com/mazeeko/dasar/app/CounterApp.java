package com.mazeeko.dasar.app;

public class CounterApp {
    public static void main(String[] args) {
        var hitung = new CounterSatu();
        System.out.println(hitung.getCount());
        hitung.decrementCount();
        hitung.incrementCount();

    }
}
