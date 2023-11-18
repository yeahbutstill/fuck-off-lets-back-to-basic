package com.zamannow.basic.programming.model.solution.fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Exercise19 {
    public static void main(String[] args) {
        for (int n = 0; n < 90; n++) {
            long[] values;
            if (n == 0 || n == 1) {
                values = new long[2];
            } else {
                values = new long[n + 1];
            }

            values[0] = 0;
            values[1] = 1;
            StdOut.println(n + " : " + enhancedF(n, values));
        }
    }

    public static int f(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return f(n - 1) + f(n - 2);
    }

    public static long enhancedF(int n, long[] values) {
        if (n == 0) return values[0];
        if (n == 1) return values[1];

        for (int i = 2; i <= n; i++) {
            values[i] = values[i - 2] + values[i - 1];
        }

        return values[n];
    }
}
