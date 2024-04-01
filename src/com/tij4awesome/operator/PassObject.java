package com.tij4awesome.operator;

/***
 * Passing objects to methods may not be
 * what you're used to.
 */
public class PassObject {
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }

    static void f(Letter y) {
        y.c = 'z';
    }
}

class Letter {
    char c;
}