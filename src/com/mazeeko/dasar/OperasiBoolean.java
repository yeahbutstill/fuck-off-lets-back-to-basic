package com.mazeeko.dasar;

public class OperasiBoolean {
  public static void main(String[] args) {
    Integer absen = 70;
    Integer nilaiAkhir = 80;

    boolean lulusAbsen = absen >= 75;
    boolean lulusNilaiAkhir = nilaiAkhir >= 75;

    // kalau && nilai kiri dan kanan harus true jika ingin hasilnya true
    boolean lulus = lulusAbsen && lulusNilaiAkhir;
    System.out.println(lulus); // karena absen kurang dari 75

    // ini true karena || yang penting naila kiri dan kanan ada yang hasilnya true
    boolean remedial = lulusAbsen || lulusNilaiAkhir;
    System.out.println(remedial);

    boolean dapetIzasah = false;
    System.out.println(!dapetIzasah);
  }
}
