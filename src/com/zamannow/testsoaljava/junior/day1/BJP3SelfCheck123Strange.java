package com.zamannow.testsoaljava.junior.day1;

public class BJP3SelfCheck123Strange {
    public static void main(String[] args) {
        first();
        third();
        second();
        third();
    }

    private static void third() {
        System.out.println("Inside third method.");
        first();
        second();
    }

    private static void second() {
        System.out.println("Inside second method.");
        first();
    }

    private static void first() {
        System.out.println("Inside first method.");
    }
}
