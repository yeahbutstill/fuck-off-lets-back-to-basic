package com.zamannow.basic;

public class AwesomeDoWhileLoop {
  public static void main(String[] args) {
    /*
    Do While loop adalah perulangan yang mirip dengan while.
    Perbedaannya hanya pada pengecekan kondisi.
    Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan,
    Sedangkan di Do While loop dilakukan setelah perulangan dilakukan.
    Oleh karena itu dalam do While Loop, minimal pasti 1 kali perulangan dilakukan.
    Walaupun kondisi tidak bernilai true
     */
    var counter = 100;
    do{
      System.out.println("Perulangan ke - " + counter);
      counter++;
    } while (counter <= 10);
  }
}
