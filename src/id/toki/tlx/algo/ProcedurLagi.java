package id.toki.tlx.algo;

import java.util.Scanner;

public class ProcedurLagi {
    // deklarasi variable global;
    public static double nilai;
    public static char huruf;

    // procedure hitung nilai
    public static void hitungNilai() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double uas = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas = input.nextDouble();
        nilai = 0.3 * uts + 0.5 * uas + 0.2 * tugas;
        System.out.println("Nilai Akhir: " + nilai);
    }

    // procedure nilai huruf
    public static void nilaiHuruf() {
        if (nilai >= 85) huruf = 'A';
        else if (nilai >= 70) huruf = 'B';
        else if (nilai >= 50) huruf = 'C';
        else if (nilai >= 30) huruf = 'D';
        else huruf = 'E';
        System.out.println("Nilai Huruf: " + huruf);
    }

    public static void main(String[] args) {
        hitungNilai();
        nilaiHuruf();
    }
}
