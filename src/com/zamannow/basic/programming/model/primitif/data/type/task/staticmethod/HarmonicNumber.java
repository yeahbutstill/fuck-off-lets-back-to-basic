package com.zamannow.basic.programming.model.primitif.data.type.task.staticmethod;

public class HarmonicNumber {
  public static void main(String[] args) {
    System.out.println(h(10));
  }

  public static double h(int n) {
    double sum = 0.0;
    for (int i = 1; i <= n; i++) {
      sum += 1.0 / i;
      System.out.println(i + " = " + sum);
    }
    return sum;
  }
}
