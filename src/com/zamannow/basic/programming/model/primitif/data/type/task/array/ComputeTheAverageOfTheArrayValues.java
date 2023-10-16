package com.zamannow.basic.programming.model.primitif.data.type.task.array;

public class ComputeTheAverageOfTheArrayValues {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7};
    int n = a.length;
    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
      double average = sum / n;
      System.out.println(average);
    }
  }
}
