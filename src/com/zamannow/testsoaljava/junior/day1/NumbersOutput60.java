package com.zamannow.testsoaljava.junior.day1;

public class NumbersOutput60 {
    public static final int SIZE = 6;
    public static void main(String[] args) {
        for (int a = 0; a < SIZE; a++) {
            for (int b = 0; b < 10-1; b++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();

        for (int c = 0; c < SIZE; c++) {
            for (int d = 1; d < 10; d++) {
                System.out.print(d);
            }
            System.out.print("0");
        }

    }
}
