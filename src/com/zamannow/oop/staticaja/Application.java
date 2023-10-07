package com.zamannow.oop.staticaja;

public class Application {
  public static final Integer PROCESSOR; // static properties

  static { // static block akan dieksekusi sekali, sebelum class ini di load
    System.out.println("Mengakses class Application");
    PROCESSOR = Runtime.getRuntime().availableProcessors();
  }
}
