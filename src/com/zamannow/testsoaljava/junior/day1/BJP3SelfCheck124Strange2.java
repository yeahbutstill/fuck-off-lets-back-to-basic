package com.zamannow.testsoaljava.junior.day1;

public class BJP3SelfCheck124Strange2 {
    public static void main(String[] args) {
        first();
        third();
        second();
        third();
    }

    private static void second() {
        System.out.println("Inside second method.");
        first();
    }

    private static void third() {
        first();
        second();
        System.out.println("Inside third method.");
    }

    private static void first() {
        System.out.println("Inside first method.");
    }
}
