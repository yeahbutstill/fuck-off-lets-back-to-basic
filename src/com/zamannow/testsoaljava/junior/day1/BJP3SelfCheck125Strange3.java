package com.zamannow.testsoaljava.junior.day1;

public class BJP3SelfCheck125Strange3 {
    public static void main(String[] args) {
        second();
        first();
        second();
        third();
    }

    private static void third() {
        System.out.println("Inside third method.");
        first();
        second();
    }

    private static void first() {
        System.out.println("Inside first method.");
    }

    private static void second() {
        System.out.println("Inside second method.");
        first();
    }
}
