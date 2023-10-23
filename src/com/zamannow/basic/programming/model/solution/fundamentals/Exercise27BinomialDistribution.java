package com.zamannow.basic.programming.model.solution.fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Exercise27BinomialDistribution {
  public static int count = 0;

  public static void main(String[] args) {
    binomial2Start(100, 50, 0.25);
  }

  // Enhanced version
  public static void binomial2Start(int N, int k, double p) {
    double[][] arr = new double[N + 1][k + 1];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = -1;
      }
    }
    StdOut.print(binomial2(arr, N, k, p));
  }

  public static double binomial2(double[][] arr, int N, int k, double p) {
    count++;
    StdOut.println(count);

    if ((N == 0) && (k == 0)) return 1.0;
    if ((N < 0) || (k < 0)) return 0.0;

    if (arr[N][k] == -1) {
      arr[N][k] = (1 - p) * binomial2(arr, N - 1, k, p) + p * binomial2(arr, N - 1, k - 1, p);
    }
    return arr[N][k];
  }
}
