package com.zamannow.basic;

public class AwesomeForLoop {
  public static void main(String[] args) {
    /*
    For adalah kata kunci yang bisa digunakan untuk melakukan perulangan
    Blok kode yang terdapat di dalam for akan selalu diulang selama kondisi for terpenuhi
    sintak perulangan for:

    for(init statement; kondisi; poststement) {
      // block perulangan;
    }

    - Init statement, akan dieksekusi hanya sekali diawal, sebelum perulangan
    - Kondisi, akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false maka perulangan akan berhenti
    - Post statement, akan dieksekusi setiap kali diakhir perulangan
    - Init Statement, Kondisi dan Post Statement tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi
    selalu bernilai true
    */

    /* for (;;) { // selalu bernilai true aka infiniti loop
      System.out.println("Awesome~");
    }*/

    // perulangan dengan kondisi
    int counter = 0;
    for (; counter <= 10; ) {
      System.out.println("Perulangan ke-" + counter);
      counter++;
    }

    System.out.println("=============================================");

    // perulangan dengan init statement
    for (int mul = 0; mul <= 10; ) {
      System.out.println("mul keberapa - " + mul);
      mul += 2;
    }

    System.out.println("=============================================");

    // perulangan dengan post statement
    for (int ma = 1; ma < 10; ma += 3) {
      System.out.println("ma-" + ma);
    }

    System.out.println();
    System.out.println();
    System.out.println("xxxxxxxxxxxxxxxxxxxxx");
    System.out.println("Bintang biasa");

    for (int a = 1; a <= 5; a++) {
      for (int b = 1; b <= a; b++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println();
    System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    System.out.println("Bintang kebalik");

    for (int c = 1; c <= 5; c++) {
      for (int d = 5; d >= c; d--) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}
