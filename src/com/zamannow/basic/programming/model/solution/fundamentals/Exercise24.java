package com.zamannow.basic.programming.model.solution.fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Exercise24 {
    // Parameters example: 90 20
    public static void main(String[] args) {
        int gcd = gcd(105, 24);
        StdOut.println("GDC 1: " + gcd);
        StdOut.println();

        int argument1 = Integer.parseInt(args[0]);
        int argument2 = Integer.parseInt(args[1]);

        int gcd2 = gcd(argument1, argument2);
        StdOut.println("GDC 2: " + gcd2);
        StdOut.println();

        int gcd3 = gcd(1111111, 1234567);
        StdOut.println("GDC 3: " + gcd3);
    }

    public static int gcd(int p, int q) {
        StdOut.println("p: " + p + " - q: " + q);
        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }
}
