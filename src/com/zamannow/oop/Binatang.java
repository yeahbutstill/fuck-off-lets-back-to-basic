package com.zamannow.oop;

public class Binatang {
  String nama;
  String hidupDimana;
  static final String BERADA = "Indonesia";

  // constructor overloading
  public Binatang(String paramNama, String paramHidupDimana) {
    nama = paramNama;
    hidupDimana = paramHidupDimana;
  }

  // constructor overloading
  public Binatang(String paramNama) {
    // but so bad
    // nama = paramNama;

    // so good memanggil constructor lain berdasarkan kontrak dari parameternya
    this(paramNama, null);
  }

  // defualt constructor
  public Binatang() {
    this(null);
  }

  void sayHello(String paramNama) {
    System.out.println(
        "Hello " + paramNama + ", My name is " + nama + ". Saya hidup di " + hidupDimana + " dan saya ada di " + BERADA);
  }
}
