package com.zamannow.testsoaljava.junior.day1;

public class BJP3SelfCheck316min {
    public static void main(String[] args) {
        System.out.println(min(3, -2, 7));
        System.out.println(min(19, 27, 6));
        System.out.println(min(0, -1, 1));
        System.out.println(min(-999999999, -99999999, -999999));
    }

    public static int min(int a, int b, int c) {
        int small;
        small = Math.min(a, b);
        small = Math.min(c, small);
        return small;
    }
}
