package com.zamannow.basic.programming.model.solution.fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Exercise3 {
    public static void main(String[] args) {
        // Parameter example 4 7 4
        int i0 = Integer.parseInt(args[0]);
        int i1 = Integer.parseInt(args[1]);
        int i2 = Integer.parseInt(args[2]);
        isEqual(i0, i1, i2);
    }

    public static void isEqual(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) StdOut.println("Equal");
        else StdOut.println("Not Equal");
    }
}
/**
 * Write a program that takes three integer command-line arguments and prints
 * equal if all three are equal, and not equal otherwise.
 */
