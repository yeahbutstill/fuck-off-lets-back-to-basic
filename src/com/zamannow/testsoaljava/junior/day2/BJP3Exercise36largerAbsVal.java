package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise36largerAbsVal {
    public static void main(String[] args) {
        System.out.println(largerAbsVal(11, 2));
        System.out.println();
        System.out.println(largerAbsVal(4, -5));
    }

    private static int largerAbsVal(int a, int b) {
        return Math.max(Math.abs(a), Math.abs(b));
    }
}
