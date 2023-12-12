package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise46printRange {
    public static void main(String[] args) {
        printRange(2, 7);
        printRange(19, 11);
        printRange(5, 5);
    }

    private static void printRange(int first, int last) {
        if (first > last) {
            for (int i = first; i >= last; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = first; i <= last; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
