package com.zamannow.basic.programming.model.solution.fundamentals;


import edu.princeton.cs.algs4.StdOut;

/*
Tulis sebuah fragmen kode yang mencetak nilai benar jika variabel ganda x dan y keduanya berada di antara 0 dan 1
dan salah jika sebaliknya.
 */
public class Exercise5 {
  public static void main(String[] args) {
    isStrictlyBetweenZeroandOne(1.12, 1.33);
    StdOut.println("Expected: false\n");

    isStrictlyBetweenZeroandOne(0.2, 1);
    StdOut.println("Expected: false\n");

    isStrictlyBetweenZeroandOne(0.5, 0.75);
    StdOut.println("Expected: true");
  }

  public static void isStrictlyBetweenZeroandOne(double x, double y) {
    if (x > 0 && x < 1 && y > 0 && y < 1) StdOut.println(true);
    else StdOut.println(false);
  }

}
