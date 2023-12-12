package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise47xo {
    public static void main(String[] args) {
        xo(5);
        System.out.println();
        xo(8);
        System.out.println();
        xo(1);
    }

    private static void xo(int size) {
        int first = 0;
        int last = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (first == j || last == j) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
            first++;
            last--;
        }
    }
}
