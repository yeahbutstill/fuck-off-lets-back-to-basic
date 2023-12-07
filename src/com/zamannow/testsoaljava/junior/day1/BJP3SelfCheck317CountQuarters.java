package com.zamannow.testsoaljava.junior.day1;

public class BJP3SelfCheck317CountQuarters {
    public static void main(String[] args) {
        System.out.println(countQuarters(64));
        System.out.println(countQuarters(1278));
        System.out.println(countQuarters(23));
        System.out.println(countQuarters(125));
        System.out.println(countQuarters(50));
        System.out.println(countQuarters(98763825));
        System.out.println(countQuarters(100));
        System.out.println(countQuarters(0));
    }

    private static int countQuarters(int a) {
        return a % 100 / 25;
    }
}
