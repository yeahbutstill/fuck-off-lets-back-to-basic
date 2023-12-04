package com.zamannow.testsoaljava.junior.day1;

public class LoopTableConstant {
    static int size;

    public static void main(String[] args) {
        size = 1;
        for (int line = 1; line <= 6; line++) {
            System.out.print(2 * line + (2 * size) + " ");
        }

        System.out.println();

        size = 2;
        for (int line = 1; line <= 6; line++) {
            System.out.print(2 * line + (2 * size) + " ");
        }

        System.out.println();

        size = 3;
        for (int line = 1; line <= 6; line++) {
            System.out.print(4 * line + (3 * size) + " ");
        }

        System.out.println();

        size = 5;
        for (int line = 1; line <= 6; line++) {
            System.out.print(4 * line + (3 * size) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("===================");

        size = 4;
        for (int line = 1; line <= 6; line++) {
            System.out.print(-1 * line + (2 * size + 3) + " ");
        }

        System.out.println();

        size = 9;
        for (int line = 1; line <= 6; line++) {
            System.out.print(-1 * line + (2 * size + 3) + " ");
        }
    }
}
