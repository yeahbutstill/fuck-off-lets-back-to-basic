package com.zamannow.basic.programming.model.primitif.data.type.test.task;

public class FindTheMaximumOfTheArrayValues {
  public static void main(String[] args) {
    double[] a = new double[10];
    a[0] = 1.0;
    a[1] = 2.0;
    a[2] = 3.0;
    a[3] = 4.0;
    a[4] = 5.0;
    a[5] = 7.0;
    a[6] = 9.0;
    a[7] = 10.0;
    a[8] = 11.0;
    a[9] = 12.0;

    double max = a[2]; // isi nilai dari index ini 3.0
    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
        System.out.println(max);
      }
    }
  }
}
