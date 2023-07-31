package com.tij.operators;

public class PassObject {
    static void f(Latter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Latter x = new Latter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);

        f(x);
        System.out.println("2: x.c: " + x.c);
    }
}

class Latter {
    char c;
}