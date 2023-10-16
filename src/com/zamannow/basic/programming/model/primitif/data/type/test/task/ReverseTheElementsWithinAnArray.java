package com.zamannow.basic.programming.model.primitif.data.type.test.task;

public class ReverseTheElementsWithinAnArray {
  public static void main(String[] args) {
    double[] a = {10, 260, 20, 60, 30, 40};
    int n = a.length;
    for (int i = 0; i < n/2; i++) {
      double temp = a[i];
      a[i] = a[n-1-i];
      a[n-i-1] = temp;

      System.out.println(a[i]);
      System.out.println(a[n-i-1]);
    }
  }
}
