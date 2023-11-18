package com.zamannow.basic;

public class TestBreak {
  public static void main(String[] args) {
    int counter = 0;
    while (true) {
      System.out.println("Perulangan ke-" + counter++);
      if (counter > 100) {
        break;
      }
    }
  }
}
