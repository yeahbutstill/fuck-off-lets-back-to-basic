package com.mazeeko.oop.exception.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
  public static void main(String[] args) {
    // manual
    BufferedReader br = null;
    try {
      /*
        On Linux at least, this would be an absolute path.
        What you probably want instead is a path relative to the project root:
       */
      br = new BufferedReader(new FileReader("src/com/mazeeko/oop/exception/trywithresource/fileeeeeeeeee.txt"));
      while (true) {
        String line = br.readLine();
        if (line == null) break;
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Error membaca file: " + e.getMessage());
      e.printStackTrace(); // good for debug but not for production
    } finally {
      if (br != null) {
        try {
          br.close();
          System.out.println("==============");
          System.out.println("Sukses menutup");
        } catch (IOException e) {
          System.out.println("Error menutup resource: " + e.getMessage());
          e.printStackTrace(); // good for debug but not for production
        }
      }
    }
  }
}
