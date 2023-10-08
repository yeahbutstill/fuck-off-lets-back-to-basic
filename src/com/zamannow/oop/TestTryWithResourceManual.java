package com.zamannow.oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestTryWithResourceManual {
  public static void main(String[] args) {
    // manual close resource
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("README.md"));
      while (true) {
        String text = reader.readLine();
        if (text == null) break;
        System.out.println(text);
      }
    } catch (IOException exception) {
      exception.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
          System.out.println("Oke, Done!");
        } catch (IOException exception) {
          exception.printStackTrace();
        }
      }
    }
  }
}
