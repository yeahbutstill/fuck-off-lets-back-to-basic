package com.zamannow.oop.staticaja;

public class Mathtil {
  // Integer... adalah variable argument
  public static Integer sum(Integer... values) {
    Integer total = 0;
    for (var value : values) {
      total += value;
    }
    return total;
  }
}
