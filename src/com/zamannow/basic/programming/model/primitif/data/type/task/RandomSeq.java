package com.zamannow.basic.programming.model.primitif.data.type.task;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq {
    public static void main(String[] args) {
        // Print N random values in (lo, hi)
        int n = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i = 0; i < n; i++) {
            double x = StdRandom.uniformDouble(lo, hi);
            StdOut.printf("%.2f\n", x);
            System.out.println("========================");
        }

        StdOut.printf("PI is approximately %.2f\n", Math.PI);
    }
}
