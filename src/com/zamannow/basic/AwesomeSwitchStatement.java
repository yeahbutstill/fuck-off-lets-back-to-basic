package com.zamannow.basic;

public class AwesomeSwitchStatement {
  public static void main(String[] args) {
    int ulangan = 50;
    int absen = 50;
    String nilai;

    if (ulangan >= 90 && absen >= 70) {
      nilai = "A";
    } else if (ulangan >= 80 && absen >= 70) {
      nilai = "B";
    } else if (ulangan >= 75 && absen >= 70) {
      nilai = "C";
    } else if (ulangan >= 65 && absen >= 70) {
      nilai = "D";
    } else {
      nilai = "E";
    }

    /*
    kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya
    menggunakan perbandingan ==.
    Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana.
    Kode di switch statement hanya untuk perbandingan ==
    */
    String ucupan;
    switch (nilai) {
      case "A" -> ucupan = "Wow anda lulus dengan Baik";
      case "B", "C" -> ucupan = "Anda lulus";
      case "D" -> ucupan = "Maaf anda tidak lulus";
      default -> ucupan = "Maaf mungkin anda salah jurusan 🤣";
    }

    System.out.println(ucupan);
  }
}
