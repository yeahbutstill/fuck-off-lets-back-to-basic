package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise515dominant {
    public static void main(String[] args) {
        System.out.println(dominant(4, 9, 2));
    }

    private static boolean dominant(int a, int b, int c) {
        if (a > b + c) {
            return true;
        } else if (b > a + c) {
            return true;
        } else if (c > a + b) {
            return true;
        }
        return false;
    }
}
