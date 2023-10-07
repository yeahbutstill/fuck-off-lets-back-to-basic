package com.zamannow.oop;

public class EqualsSalah {
  public static void main(String[] args) {
    String first = "dnl";
    first += " " + "walah";
    String second = "dnl walah";

    System.out.println(first);
    System.out.println(second);
    System.out.println(first == second); // false
    System.out.println(first.equals(second)); // true
  }
}
