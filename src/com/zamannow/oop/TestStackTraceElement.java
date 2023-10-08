package com.zamannow.oop;

public class TestStackTraceElement {
  public static void main(String[] args) throws Throwable {
    //    try {
    //      String[] names = {"dnl", "huh", "yeah"};
    //      System.out.println(names[3]);
    //
    //    } catch (Throwable throwable) {
    //      throwable.printStackTrace();
    //    }

    sampleError();
  }

  public static void sampleError() throws Throwable {
    try {
      String[] namesAnimal = {"wildan", "wildan", "gias"};
      System.out.println(namesAnimal[100]);
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }
}
