package com.zamannow.testsoaljava.junior.day1;

public class BJP3Exercise31printNumbers {
    public static void main(String[] args) {
        printNumbers(15);
        System.out.println();
        printNumbers(5);
    }

    private static void printNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.print("[" + i + "] ");
        }
    }
}
