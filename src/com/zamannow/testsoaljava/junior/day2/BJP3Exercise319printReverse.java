package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise319printReverse {
    public static void main(String[] args) {
        printReverse("hello there!");
    }

    private static void printReverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
