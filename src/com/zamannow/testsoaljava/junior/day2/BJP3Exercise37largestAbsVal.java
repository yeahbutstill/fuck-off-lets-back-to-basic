package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise37largestAbsVal {
    public static void main(String[] args) {
        System.out.println(largestAbsVal(7, -2, -11));
        System.out.println(largestAbsVal(-4, 5, 2));
    }

    private static int largestAbsVal(int i, int i1, int i2) {
        int a = Math.max(Math.abs(i1), Math.abs(i2));
        return Math.max(Math.abs(i), a);
    }
}
