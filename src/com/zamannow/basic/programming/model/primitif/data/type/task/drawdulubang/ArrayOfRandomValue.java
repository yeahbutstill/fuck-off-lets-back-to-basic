package com.zamannow.basic.programming.model.primitif.data.type.task.drawdulubang;

import com.zamannow.basic.programming.model.primitif.data.type.Array;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class ArrayOfRandomValue {
  public static void main(String[] args) {
    int n = 1000;
    double[] a = new double[n];
    for (int i = 0; i < n; i++) {
      a[i] = StdRandom.random();
    }
    Arrays.sort(a);
    for (int i = 0; i < n; i++) {
      double x = 1.0 * i / n;
      double y = a[i] / 2.0;
      double rw = 0.5 / n;
      double rh = a[i] / 2.0;
      StdDraw.filledRectangle(x, y, rw, rh);
    }
  }
}
