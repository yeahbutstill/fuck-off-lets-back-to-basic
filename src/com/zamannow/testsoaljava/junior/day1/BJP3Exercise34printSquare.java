package com.zamannow.testsoaljava.junior.day1;

public class BJP3Exercise34printSquare {
    public static void main(String[] args) {
        printSquare(1, 5);
        System.out.println();
        System.out.println();
        printSquare(3, 9);
        System.out.println();
        System.out.println();
        printSquare(0, 3);
        System.out.println();
        System.out.println();
        printSquare(5, 5);
    }

    public static void printSquare(int min, int max) {
        for (int row = min; row <= max; row++) {
            for (int i = row; i <= max; i++) {
                System.out.print(i);
            }

            for (int h = min; h < row; h++) {
                System.out.print(" " + h);
            }
            System.out.println();
        }
    }
}
