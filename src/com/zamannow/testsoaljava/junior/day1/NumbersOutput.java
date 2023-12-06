package com.zamannow.testsoaljava.junior.day1;

public class NumbersOutput {
    public static final int SIZE = 6;
    public static final int SIZE2 = 10;

    public static void main(String[] args) {
        for (int a = 0; a < SIZE; a++) {
            for (int b = 0; b < SIZE2 - 1; b++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }

        System.out.println();

        for (int a = 0; a < SIZE; a++) {
            for (int b = 1; b < SIZE2; b++) {
                System.out.print(b);
            }
            System.out.print("0");
        }
    }
}