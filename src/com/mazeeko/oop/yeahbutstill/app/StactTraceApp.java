package com.mazeeko.oop.yeahbutstill.app;

public class StactTraceApp {
  public static void main(String[] args) {
    try {
      String[] names = {"sasuke", "maya", "dani"};
      System.out.println(names[100]);
    } catch (Throwable throwable) {
      StackTraceElement[] stackTrace = throwable.getStackTrace();
      throwable.printStackTrace();
    }
  }
}
