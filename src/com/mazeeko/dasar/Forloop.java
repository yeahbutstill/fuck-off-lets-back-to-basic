package com.mazeeko.dasar;

public class Forloop {
  public static void main(String[] args) {
    //        for(;;) {
    //            System.out.println("Perulangan tanpa henti");
    //        }

    // Prulangan dengan kondisi
    Integer counter = 1;
    for (; counter <= 5; ) {
      System.out.println("Perulangan ke - " + counter);
      counter++;
    }
    System.out.println("======================" + counter);

    // perulangan dengan post statement
    for (; counter < 10; counter++) {
      System.out.println("Perulangan ke - " + counter);
    }
    System.out.println("=======================" + counter);

    // perulangan dengan init statement
    for (Integer counter2 = 1; counter2 <= 5; counter2++) {
      System.out.println("Perulangan ke - " + counter2);
    }

    System.out.println();
    System.out.println("=================================== test");

    for (int a = 0; a < 10; a++) {
      for (int b = a; b <= 10; b++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int a = 0; a <= 10; a++) {
      for (int c = 0; c <= a; c++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("============================================");



  }
}
