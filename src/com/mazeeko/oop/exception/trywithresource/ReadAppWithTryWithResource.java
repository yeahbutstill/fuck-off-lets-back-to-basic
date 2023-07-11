package com.mazeeko.oop.exception.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAppWithTryWithResource {
  public static void main(String[] args) {
    // try with resource
    try (BufferedReader br = new BufferedReader(
            new FileReader("src/com/mazeeko/oop/exception/trywithresource/fileeeeeeeeee.txt"))) {
      while (true) {
        String line = br.readLine();
        if (line == null) break;
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Error membaca file: " + e.getMessage());
      e.printStackTrace(); // good for debug but not for production
    }
  }
}
