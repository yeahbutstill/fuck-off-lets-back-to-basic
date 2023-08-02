package com.tij.initializationileanup;

public class OverloadingOrder {
    public static void main(String[] args) {
        f("String first", 11);
        f(99, "int first");
    }

    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }
}
