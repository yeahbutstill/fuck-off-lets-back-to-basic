package com.zamannow.basic;

public class NotPrimitive {
  Integer iniInteger;
  String iniString;
  Boolean iniBoolean;

  public static void main(String[] args) {
    Integer umur;
    umur = 30;
    String nama;
    nama = "hohoho";
    Boolean masihHidup;
    masihHidup = true;

    System.out.println(umur);
    System.out.println(nama);
    System.out.println(masihHidup);

    // konversi dari tipe data primitif
    int jumlah = 50; // bukan object
    Integer jumlahObject = jumlah; // object
    System.out.println(jumlahObject);

    int jumlahAgain = jumlahObject;
    short i = jumlahObject.shortValue();
    byte b = jumlahObject.byteValue();
    System.out.println(jumlahAgain);
    System.out.println(i);
    System.out.println(b);
  }
}
