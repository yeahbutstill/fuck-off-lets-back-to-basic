package com.zamannow.testsoaljava.junior.day1;

public class Window {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        System.out.print("+");
        for (int times = 0; times < 2; times++) {
            for (int equals = 0; equals < SIZE; equals++) {
                System.out.print("=");
            }
            System.out.print("+");
        }
        System.out.println();

        for (int box = 0; box < 2; box++) {
            // print |  |  |
            for (int rows = 0; rows < SIZE; rows++) {
                System.out.print("|");
                for (int runs = 0; runs < 2; runs++) {
                    for (int spaces = 0; spaces < SIZE; spaces++) {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                }
                System.out.println();
            }

            // print +==+==+
            System.out.print("+");
            for (int times = 0; times < 2; times++) {
                for (int equals = 0; equals < SIZE; equals++) {
                    System.out.print("=");
                }
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
