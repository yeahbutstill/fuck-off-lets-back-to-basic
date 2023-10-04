package com.zamannow.basic;

public class OldWhileBreakBro {
  public static void main(String[] args) {
    /*
    pada old switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan
    case dalam switch statement.
    Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
    Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini,
    lalu melanjutkan ke perulangan selanjutnya.
     */
    var counter = 1;
    while (true) {
      System.out.println("Perulangan while ke -" + counter);
      counter++;
      if (counter >= 10) {
        break; // berhenti
      }
    }

    System.out.println("=================================");

    for (int count = 1; count <= 10; count++) {
      if (count % 2 == 0) {
        continue; // skip lanjut ke statment perulangan
      }
      System.out.println("Perulangan for ke - " + count);
    }
  }
}
