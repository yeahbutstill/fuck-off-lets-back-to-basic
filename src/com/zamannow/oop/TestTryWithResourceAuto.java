package com.zamannow.oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestTryWithResourceAuto {
  public static void main(String[] args) {
    // auto close resource
    try (var reader = new BufferedReader(new FileReader("README.md"))) {
      while (true) {
        String text = reader.readLine();
        if (text == null) break;
        System.out.println(text);
      }
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}
