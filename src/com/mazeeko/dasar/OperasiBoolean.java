package com.mazeeko.dasar;

// Operasi yang digunakan untuk Membandingkan 2 data boolean
public class OperasiBoolean {
  public static void main(String[] args) {
    Integer absen = 70;
    Integer nilaiAkhir = 80;

    // Operasi matematikan yang digunaka untuk Membandingkan type data Number yang menghasilkan balikan type data boolean
    boolean lulusAbsen = absen >= 75;
    boolean lulusNilaiAkhir = nilaiAkhir >= 75;

    // kalau &&(dan) nilai kanan dan kiri harus true jika ingin hasilnya true
    boolean lulus = lulusAbsen && lulusNilaiAkhir;
    System.out.println(lulus); // karena absen kurang dari 75

    // ini true karena ||(Atau) yang penting naila kanan dan kiri ada yang hasilnya true
    // jika false maka nika kanan dan kiri itu false
    boolean remedial = lulusAbsen || lulusNilaiAkhir;
    System.out.println(remedial);

    boolean dapetIzasah = false;
    System.out.println(!dapetIzasah); // Operator !(tidak benar/kebalikan)

  }
}
