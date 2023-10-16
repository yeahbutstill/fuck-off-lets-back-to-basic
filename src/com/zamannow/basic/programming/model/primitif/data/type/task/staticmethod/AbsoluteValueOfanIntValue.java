package com.zamannow.basic.programming.model.primitif.data.type.task.staticmethod;

public class AbsoluteValueOfanIntValue {
  public static void main(String[] args) {
    System.out.println(abs(10));
  }

  public static int abs(int x) {
    if (x < 0) {
      return -x;
    } else {
      return x;
    }
  }
}
