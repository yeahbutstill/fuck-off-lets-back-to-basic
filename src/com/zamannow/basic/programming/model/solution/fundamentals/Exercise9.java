package com.zamannow.basic.programming.model.solution.fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {
  public static void main(String[] args) {
    String x = intTobinary(32);
    StdOut.println(x);
    System.out.println("Expected: " + x.equals("100000"));
  }

  public static String intTobinary(int n) {
    String result = "";
    while (n > 0) {
      result = n % 2 + result;
      n /= 2;
    }
    return result;
  }
}
