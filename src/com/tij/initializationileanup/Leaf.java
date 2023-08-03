package com.tij.initializationileanup;

public class Leaf {
    int i = 0;
    double d = 0.0;

    Leaf increment() {
        i++;
        d++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
        System.out.println("d = " + d);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
