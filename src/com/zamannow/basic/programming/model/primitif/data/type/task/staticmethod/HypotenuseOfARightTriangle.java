package com.zamannow.basic.programming.model.primitif.data.type.task.staticmethod;

public class HypotenuseOfARightTriangle {
  public static void main(String[] args) {
    System.out.println(hypotenuse(10, 10));
  }

  public static double hypotenuse(double a, double b) {
    return Math.sqrt(a*a + b*b);
  }
}
