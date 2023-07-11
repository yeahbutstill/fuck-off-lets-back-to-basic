package com.mazeeko.oop.yeahbutstill.app;

public class StactTraceApp {
  public static void main(String[] args) {
    try {
      String[] names = {"sasuke", "maya", "dani"};
      System.out.println(names[100]);
    } catch (Throwable throwable) {
      StackTraceElement[] stackTrace = throwable.getStackTrace(); // manual dan ribet
      throwable.printStackTrace(); // automatis ditangkep, kesayangan akoh nich
    }

    System.out.println("error bertingkat pasti debugnya selalu dari Cause by:");
    try {
      sampleError();
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }

  public static void sampleError() {
    try {
      String[] names = {"sasuke", "maya", "dani"};
      System.out.println(names[100]);
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }
}
