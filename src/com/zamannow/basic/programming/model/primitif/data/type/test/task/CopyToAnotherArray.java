package com.zamannow.basic.programming.model.primitif.data.type.test.task;

import java.util.Arrays;

public class CopyToAnotherArray {
  public static void main(String[] args) {
    int[] a = {10, 20, 30, 40};
    int n = a.length;
    double[] b = new double[n];
    for (int i = 0; i < n; i++) {
      b[i] = a[i];
      System.out.println(Arrays.toString(b));
    }
  }
}
