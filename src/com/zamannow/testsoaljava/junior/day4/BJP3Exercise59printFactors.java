package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise59printFactors {
    public static void main(String[] args) {
        printFactors(24);
    }

    private static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i != n) {
                System.out.print(i + " and ");
            } else if (i == n) {
                System.out.print(i);
            }
        }
    }
}
