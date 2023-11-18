package com.zamannow.basic.programming.model.solution.fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Exercise20 {
    public static void main(String[] args) {
        StdOut.println("ln(5!) = " + inFactorial(5));
        StdOut.println("Expected: 4.787491742782046");
    }

    public static double inFactorial(int n) {
        if (n == 1) {
            return 0;
        }

        return Math.log(n) + inFactorial(n - 1);
    }
}
