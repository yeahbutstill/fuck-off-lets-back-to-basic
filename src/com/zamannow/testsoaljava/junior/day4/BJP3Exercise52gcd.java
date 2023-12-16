package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise52gcd {
    public static void main(String[] args) {
        System.out.println(gcd(24, 84));
        System.out.println(gcd(105, 45));
        System.out.println(gcd(0, 8));
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            // value that stores a
            int valA = a;
            // mod A by B
            a = b;
            // eventually, B will store 0 and A will store the greatest common devisor
            b = valA % b;
        }
        return Math.abs(a);
    }
}
