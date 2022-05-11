package com.dicoding.javafundamental.basic.strukturdasar.operator;

/**
 * Kode di atas merupakan implementasi simbol-simbol Aritmatika yang didukung oleh Java.
 * Seperti pada kode “int hasilPenjumlahan = 5 + 1”, tentunya ini cukup mudah dipahami bagi kita yang sudah mengenal matematika dasar.
 * Selanjutnya adalah implementasi dari operasi hasil bagi atau yang dipanggil dengan Modulus (mod).
 * int hasilSisa = 8 % 2;
 * int hasilSisaLain = 9 % 2;
 * <p>
 * Modulus yang berarti habis dibagi, bila dicetak akan menghasilkan keluaran berikut ini:
 * <p>
 * Operasi Habis bagi
 * Hasil 8 % 2 = 0
 * Hasil 9 % 2 = 1
 * Dari output di atas, dapat disimpulkan bahwa nilai variabel 8 tidak bersisa bila dibagi dengan variabel 2.
 * Sementara itu, nilai variabel 9 jika dibagi dengan variabel yang sama (2), menyisakan sisa hasil bagi 1.
 */

public class OperatorAritmatika {
    public static void main(String[] args) {
        System.out.println("Operasi Penjumlahan");
        int hasilPenjumlahan = 5 + 1;
        System.out.println("Hasil 5 + 1 = " + hasilPenjumlahan);
        System.out.println();

        System.out.println("Operasi Pengurangan");
        int hasilPengurangan = 4 - 1;
        System.out.println("Hasil 4 - 1 = " + hasilPengurangan);
        System.out.println();

        System.out.println("Operasi Pengalian");
        int hasilPengalian = 5 * 5;
        System.out.println("Hasil 5 * 5 = " + hasilPengalian);
        System.out.println();

        System.out.println("Operasi Pembagian");
        int hasilPembagian = 20 / 2;
        System.out.println("Hasil 20 / 2 = " + hasilPembagian);
        System.out.println();

        System.out.println("Operasi Habis Bagian");
        int hasilSisa = 8 % 2;
        System.out.println("Hasil 8 % 2 = " + hasilSisa);
        System.out.println();
        System.out.println("Operasi Habis Bagian");
        int hasilSisaLain = 9 % 2;
        System.out.println("Hasil 9 % 2 = " + hasilSisaLain);
        System.out.println();

    }
}
