package com.dicoding.javafundamental.basic.strukturdasar.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {
        int nilaiUjian = 80;
        char indeksPrestasi;

        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indeksPrestasi = 'D';
        } else if (nilaiUjian >= 50) {
            indeksPrestasi = 'E';
        } else {
            indeksPrestasi = 'F';
        }
        System.out.println("Nilai ujian akhir anda adalah " + indeksPrestasi);
    }
}

/**
 * Kode di atas memiliki beberapa cabang kode yang bisa dijalankan.
 * Tergantung dari nilai variabel integer nilaiUjian,
 * kode yang dijalankan akan mengikuti nilainya. Di atas atau sama dengan 90 maka indeks prestasi adalah 'A';
 * di atas 80 maka 'B'; di atas 70 maka 'C'; di atas 60 maka 'D'; di atas 50 maka 'E';
 * terakhir di bawah 50 maka indeks prestasinya adalah 'F'.
 * <p>
 * Bisa disimpulkan bahwa else merupakan pilihan terakhir.
 * Ketika if dan semua else-if nilainya adalah false maka kode di dalam else yang akan dijalankan.
 */