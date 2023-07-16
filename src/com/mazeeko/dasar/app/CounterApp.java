package com.mazeeko.dasar.app;

public class CounterApp {
    public static void main(String[] args) {
        CounterSatu c;
        var d = new CounterSatu();
        c = new CounterSatu();
        d = c;

        var e = new CounterSatu();

        System.out.println(d.equals(c));
        System.out.println(e.equals(d));
    }
}
