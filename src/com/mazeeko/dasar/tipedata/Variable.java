package com.mazeeko.dasar.tipedata;
public class Variable {
    public static void main(String[] args) {
        // ini engga bisa, wajib inisialisasi atau harus ada valuenya di variabel tersebut jika menggunakan var.
        // karena kalau tidak ada valuenya, maka akan error
        //! var name; // error
        var age = 30; // ini secara pintar si java akan menyesuaikan tipe data dari value yang sudah di set
        var address = "Jakarta";

        // constant value
        final var name = "Mazeeko";
        // name = "Dani"; // error karena name sudah constant

        String nameCoba;
        nameCoba = "Coba ubah saya";
        System.out.println(nameCoba);
        // ini akan berubah karena progran java itu dirunning dari atas ke bawah
        nameCoba = "Saya ubah sekarang";
        System.out.println(nameCoba);

        System.out.println(age);
        System.out.println(address);
        System.out.println(name);
    }
}
