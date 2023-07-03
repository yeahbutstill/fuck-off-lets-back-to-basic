package com.mazeeko.dasar;

public class Scope {
  public static void main(String[] args) {}

  public static void sayHello(String name) {
    String hello = "Hello " + name;
    if (!name.isBlank()) {
      String hi = "Hi " + name;
      System.out.println(hi);
    }
    System.out.println(hello);

    // error karena diluar scope
    // System.out.println(h1);
  }
}
