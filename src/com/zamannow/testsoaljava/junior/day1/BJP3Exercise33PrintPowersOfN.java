package com.zamannow.testsoaljava.junior.day1;

public class BJP3Exercise33PrintPowersOfN {
    public static void main(String[] args) {
        printPowersOfN(4, 3);
        System.out.println();
        printPowersOfN(5, 6);
        System.out.println();
        printPowersOfN(-2, 8);
    }

    private static void printPowersOfN(int a, int b) {
        for (int i = 0; i <= b; i++) {
            System.out.print((int) Math.pow(a, i) + " ");
        }
    }
}
