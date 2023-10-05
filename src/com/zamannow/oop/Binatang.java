package com.zamannow.oop;

public class Binatang {
  String nama;
  String hidupDimana;
  static final String BERADA = "Indonesia";

  public Binatang(String paramNama, String paramHidupDimana) {
    nama = paramNama;
    hidupDimana = paramHidupDimana;
  }

  void sayHello(String paramNama) {
    System.out.println(
        "Hello " + paramNama + ", My name is " + nama + ". Saya hidup di " + hidupDimana + " dan saya ada di " + BERADA);
  }
}
