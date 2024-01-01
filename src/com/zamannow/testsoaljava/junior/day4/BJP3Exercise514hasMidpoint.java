package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise514hasMidpoint {
    public static void main(String[] args) {
        System.out.println(hasMidPoint(4, 6, 8));
    }

    private static boolean hasMidPoint(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            return true;
        } else {
            int smallest = Math.min(a, Math.min(b, c));
            int largest = Math.max(a, Math.max(b, c));
            double midpoint = (smallest + largest) / 2.0;

            if (midpoint != smallest) {
                if (midpoint == a || midpoint == b || midpoint == c) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
