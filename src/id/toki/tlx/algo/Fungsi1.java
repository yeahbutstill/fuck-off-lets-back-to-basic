package id.toki.tlx.algo;

import java.util.Scanner;

public class Fungsi1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nilai UTS: ");
    double uts = input.nextDouble();
    System.out.print("Nilai UAS: ");
    double uas = input.nextDouble();
    System.out.print("Nilai Tugas: ");
    double tugas = input.nextDouble();
    double nilaiAkhir = hitungNilai(uts, uas, tugas);
    System.out.println("Nilai Akhir: " + nilaiAkhir);
    System.out.println("Nilai Huruf: " + nilaiHuruf(nilaiAkhir));
  }

  // fungsi hitung nilai
  public static double hitungNilai(double a, double b, double c) {
    double nilaiAkhir = a * 0.3 + b * 0.5 + c * 0.2;
    return nilaiAkhir;
  }

  // fungsi nilai huruf
  public static char nilaiHuruf(double nilaiAkhir) {
    char nh = ' ';
    if (nilaiAkhir >= 85) nh = 'A';
    else if (nilaiAkhir >= 70) nh = 'B';
    else if (nilaiAkhir >= 60) nh = 'C';
    else if (nilaiAkhir >= 50) nh = 'D';
    else nh = 'E';
    return nh;
  }
}
