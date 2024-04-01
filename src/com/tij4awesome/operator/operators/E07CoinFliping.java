package com.tij4awesome.operator.operators;

import java.util.Random;

/**
 * E07CoinFliping
 * Write a program that simulates coin-fliping.
 */
public class E07CoinFliping {
    public static void main(String[] args) {
        Random rand = new Random(47);
        boolean flip = rand.nextBoolean();
        System.out.println("OUTCOME: ");
        System.out.println(flip ? "HEAD" : "TAIL");
    }
}
/**
 * Ini sebagian merupakan latihan dalam penggunaan Perpustakaan Java Standar.
 * Setelah membiasakan diri dengan dokumentasi HTML untuk JDK (dapat diunduh
 * dari java.sun.com), pilih “R” di indeks JDK untuk melihat
 * berbagai cara menghasilkan angka acak.
 */

/**
 * Program ini menggunakan operator if-else ternary untuk menghasilkan
 * keluaran. (Lihat bagian Operator Ternary if-else di TIJ4
 * untuk informasi lebih lanjut.)
 */

/***
 * CATATAN: Biasanya Anda akan membuat objek Acak tanpa argumen untuk itu
 * menghasilkan output yang berbeda untuk setiap eksekusi program.
 * Kalau tidak, itu tidak bisa disebut simulator. Dalam latihan ini
 * dan seluruh buku ini, kami menggunakan nilai awal 47 untuk
 * membuat keluarannya identik, sehingga dapat diverifikasi,
 * untuk setiap proses.
 */
