package com.mazeeko.dasar;

public class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}

class Main2 {
    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
    }
}
