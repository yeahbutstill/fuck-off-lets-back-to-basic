package com.zamannow.basic;

public class AwesomeStemenetIF {
  public static void main(String[] args) {
    var nilai = 60;
    var absen = 60;

    if (nilai >= 75 && absen >= 75) { // block if akan dieksekusi ketika kondisi if bernilai true
      System.out.println("Anda lulus");
    } else if (nilai == 60 && absen == 60) { // kadang dalam if kita butuh membuat beberapa kondisi
      System.out.println("maaf anda harus remed");
    } else { // kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
      System.out.println("maaf anda gagal");
    }
  }
}
