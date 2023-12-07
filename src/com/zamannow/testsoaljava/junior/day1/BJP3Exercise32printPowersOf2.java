package com.zamannow.testsoaljava.junior.day1;

public class BJP3Exercise32printPowersOf2 {
    public static void main(String[] args) {
        printPowersOf2(3);
        System.out.println();
        printPowersOf2(10);
    }

    public static void printPowersOf2(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }
}
