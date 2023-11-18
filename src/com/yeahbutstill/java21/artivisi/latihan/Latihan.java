package com.yeahbutstill.java21.artivisi.latihan;

import java.time.LocalDate;

public class Latihan {
    public static void main(String[] args) {
        var k1 = new Kalkulator();
        var hasil = k1.tambah(4, 18);
        System.out.println("Hasil penjumlahan = " + hasil);

        System.out.println();
        System.out.println("Jumlah karyawan: " + Karyawan.jumlahKaryawan);
        System.out.println();

        var karyawan = new Karyawan();
        karyawan.nama = "dnl";
        karyawan.nip = "121212";
        karyawan.setTanggalLahir(LocalDate.of(2000, 12, 31));
        System.out.println("Nama karyawan: " + karyawan.nama);
        System.out.println("Nip karyawan: " + karyawan.nip);
        System.out.println("Jumlah karyawan: " + Karyawan.jumlahKaryawan);
        System.out.println("Usia karyawan: " + karyawan.hitungUsia());

        System.out.println();
        System.out.println();

        var karyawan1 = new Karyawan("123", "myt");
        System.out.println("Nama karywan1: " + karyawan1.nama);
        System.out.println("Jumlah karyawan sekarang: " + Karyawan.jumlahKaryawan);

        System.out.println();
        System.out.println();

        // tampilkan isi karyawan sekali lagi
        System.out.println(karyawan.nama);
        System.out.println(Karyawan.jumlahKaryawan);
        System.out.println(Karyawan.jumlahKaryawan);
    }
}
