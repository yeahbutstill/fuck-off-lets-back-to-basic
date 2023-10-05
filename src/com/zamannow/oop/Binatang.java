package com.zamannow.oop;

public class Binatang {
  String nama;
  String hidupDimana;
  static final String BERADA = "Indonesia";

  // constructor overloading
  public Binatang(String paramNama, String paramHidupDimana) {
    this.nama = paramNama; // ini artinya (object saat ini.nama propertiesnya = nama parameternya)
    this.hidupDimana = paramHidupDimana;
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
    // kalau default constructor sebenernya engga perlu disuruh manggil constructor lain
    // tapi kalau mau, juga bisa kok
    // this(null);
  }

  void sayHello(String paramNama) {
    System.out.println(
        "Hello " + paramNama + ", My name is " + this.nama + ". Saya hidup di " + this.hidupDimana + " dan saya ada di " + BERADA);
  }

  void sayHello() {
    this.sayHello("Bos");
  }
}
