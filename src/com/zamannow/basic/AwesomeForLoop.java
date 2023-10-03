package com.zamannow.basic;

public class AwesomeForLoop {
  public static void main(String[] args) {
    /*
    For adalah kata kunci yang bisa digunakan untuk melakukan perulangan
    Blok kode yang terdapat di dalam for akan selalu diulang selama kondisi for terpenuhi
    sintak perulangan for:

    for(init statement; kondisi; poststement) {
      // block perulangan
    }

    - init statement, akan dieksekusi hanya sekali diawal, sebelum perulangan kondisi akan dilakukan
    pengecekan dalam setiap perulangan. Jika true perulangan tersebut akan dilakukan, jika false perulangan akan berhenti.
    - post statement, akan dieksekusi setiap kali diakhir perulangan
    - init statement, Kondisi dan Post Statement tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi
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
    for (int ma = 1; ma < 10; ma+=3) {
      System.out.println("ma-" + ma);
    }
  }
}
