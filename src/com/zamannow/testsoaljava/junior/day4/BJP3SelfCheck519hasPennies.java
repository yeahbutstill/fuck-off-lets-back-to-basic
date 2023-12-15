package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck519hasPennies {
    public static void main(String[] args) {
        System.out.println(hasPennies(300));
    }

    private static boolean hasPennies(int cents) {
        return cents % 5 != 0;
    }
}
