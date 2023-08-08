package com.mazeeko.dasar;
public class Variable {
    public static void main(String[] args) {
        // ini engga bisa, wajib inisialisasi atau harus ada valuenya di variabel tersebut jika menggunakan var.
        // karena kalau tidak ada valuenya, maka akan error
        //! var name; // error
        var age = 30;
        var address = "Jakarta";

        final var name = "Mazeeko";
        // name = "Dani"; // error karena name sudah constant

        System.out.println(age);
        System.out.println(address);
        System.out.println(name);
    }
}
