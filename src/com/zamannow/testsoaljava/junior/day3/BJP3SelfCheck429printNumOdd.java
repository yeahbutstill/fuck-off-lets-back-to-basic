package com.zamannow.testsoaljava.junior.day3;

public class BJP3SelfCheck429printNumOdd {
    public static void main(String[] args) {
        printNumOdd(2, 6, 4);
    }

    private static void printNumOdd(int n1, int n2, int n3) {
        int count = 0;
        if (n1 % 2 != 0) {
            count++;
        }

        if (n2 % 2 != 0) {
            count++;
        }

        if (n3 % 2 != 0) {
            count++;
        }

        System.out.println(count + " of the 3 numbers are odd.");
    }
}
