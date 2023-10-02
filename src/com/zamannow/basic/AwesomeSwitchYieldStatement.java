package com.zamannow.basic;

public class AwesomeSwitchYieldStatement {
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

    Di Java 14. ada kata kunci yield, dimana kita bisa mengembalikan nilai pada switch statement.
    ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement.
    */
    String ucapan = switch (nilai) {
      case "A" : yield "Wow anda lulus dengan Baik";
      case "B", "C" : yield  "Anda lulus";
      case "D" : yield  "Maaf anda tidak lulus";
      default : yield "Maaf mungkin anda salah jurusan 🤣";
    };

    System.out.println(ucapan);
  }
}
