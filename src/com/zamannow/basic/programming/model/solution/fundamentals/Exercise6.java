package com.zamannow.basic.programming.model.solution.fundamentals;


import edu.princeton.cs.algs4.StdOut;

public class Exercise6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println("f = " + f);
            StdOut.println("g = " + g);
            f = f + g;
            StdOut.printf("f = f + g --> %d\n", f);
            g = f - g;
            System.out.printf("g = f - g --> %d\n", g);
            System.out.println("============");
        }
    }

}
