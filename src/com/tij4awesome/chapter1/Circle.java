package com.tij4awesome.chapter1;

public class Circle extends Shape {
    @Override
    public void draw() {
        // Untuk mengganti method, anda cukup membuat definisi baru untuk metode di kelas turunan
        // lalu ini seperti berkata "Saya menggunakan metode interface yang sama di sini, tetapi saya
        // ingin method ini melakukan sesuatu yang berbeda untuk tipe baru saya"
        System.out.println("gambar lingkaran");
    }

    @Override
    public void erase() {
        // Untuk mengganti method, anda cukup membuat definisi baru untuk metode di kelas turunan
        // lalu ini seperti berkata "Saya menggunakan metode interface yang sama di sini, tetapi saya
        // ingin method ini melakukan sesuatu yang berbeda untuk tipe baru saya"
        System.out.println("hapus lingkaran");
    }

    /***
     * method baru ini bukan bagian dari interface kelas dasar
     * ini berarti kelas dasar tidak melakukan sebanyak yang anda inginkan
     * jadi Anda menambahkan lebih banyak metode.
     * Penggunaan warisan(Inheritance) yang sederhana dan primitif ini,
     * terkadang, merupakan solusi sempurna untuk masalah Anda.
     * Namun, Anda harus mencermati kemungkinan bahwa kelas dasar Anda juga memerlukan metode tambahan ini.
     * Proses penemuan dan pengulangan desain Anda ini terjadi secara teratur dalam pemrograman berorientasi objek.
     */
    public void methodBaru() {
        System.out.println("Untuk membedakan kelas turunan baru dari kelas dasar asli");
    }
}
