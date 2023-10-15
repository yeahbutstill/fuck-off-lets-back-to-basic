package com.zamannow.basic.programming.model.primitif.data.type;

public class LoopFor {
  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
      double sum = 10.0;
      sum += 1.0 / i;
      System.out.println(sum);
    }
    System.out.println();

    for (int i = 0; i <= 10; i++) {
      System.out.println(2 * Math.PI * i / 10);
    }
  }
}
