package com.zamannow.testsoaljava.junior.day3;

public class Oops4errors {
    public static void main(String[] args) {
        int a = 7;
        int b = 42;

        minimum(a, b);
    }

    private static void minimum(int a, int b) {
        if (a < b) {
            int smaller = a;
            if (smaller == a) {
                System.out.println("a is the smallest!");
            }
        } else if (a >= b) {
            int smaller = b;
        }
    }
}
