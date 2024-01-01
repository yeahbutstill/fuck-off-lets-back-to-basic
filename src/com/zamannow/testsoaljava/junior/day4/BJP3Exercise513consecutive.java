package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise513consecutive {
    public static void main(String[] args) {
        System.out.println(consecutive(1, 2, 3));
    }

    private static boolean consecutive(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return false;
        } else {
            int smallest = Math.min(a, Math.min(b, c));
            int largest = Math.max(a, Math.max(b, c));
            return largest - smallest == 2;
        }
    }
}
