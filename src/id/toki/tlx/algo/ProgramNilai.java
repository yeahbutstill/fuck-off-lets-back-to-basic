package id.toki.tlx.algo;

import java.util.Scanner;

public class ProgramNilai {
  public static void main(String[] args) {
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAngka;
    String nilaiHuruf;
    String nama;
    String predikat;

    Scanner sc = new Scanner(System.in);
    System.out.print("Nama Siswa : ");
    nama = sc.nextLine();

    System.out.print("Nilai Tugas: ");
    nilaiTugas = sc.nextDouble();

    System.out.print("Nilai UTS: ");
    nilaiUTS = sc.nextDouble();

    System.out.print("Nilai UAS: ");
    nilaiUAS = sc.nextDouble();

    // nilai Tugas = 30%, UTS = 30%, UAS = 40%
    // penulisan perhitungan persen dapat dilakukan dengan dua cara,
    // yaitu (30*ntugas)/100 atau (nuts*0.30).
    nilaiAngka = (30 * nilaiTugas) / 100 + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);
    System.out.println("Nilai Akhir : " + nilaiAngka);

    // Cek kondisi untuk mendapatkan nilai huruf
    if (nilaiAngka >= 85 && nilaiAngka <= 100) {
      nilaiHuruf = "A";
      predikat = "Sangat Baik";
    } else if (nilaiAngka >= 70 && nilaiAngka < 85) {
      nilaiHuruf = "B";
      predikat = "Baik";
    } else if (nilaiAngka >= 56 && nilaiAngka < 70) {
      nilaiHuruf = "C";
      predikat = "Cukup Baik";
    } else if (nilaiAngka >= 40 && nilaiAngka < 56) {
      nilaiHuruf = "D";
      predikat = "Kurang Baik";
    } else {
      nilaiHuruf = "E";
      predikat = "Gagal";
    }

    System.out.println(nama);
    System.out.println("Nilai Huruf : " + nilaiHuruf);
    System.out.println("Predikat : " + predikat);
  }
}
