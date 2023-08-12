package com.mazeeko.dasar;

import java.util.Date;

public class Statement {
    public static void main(String[] args) {
        // Statement bisa dibilang adalah kalimat lengkap bahasa
        // Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma
        // ada beberapa jenis statement:
        // Assignment expression
        // Penggunaan ++ dan --
        // Method invocation
        // Object creation expression

        // assignment statement = statement yang mengubah value
        double d = 9999.999;

        // increment statement = statement yang menambahkan value
        d++;

        // method invocation statement = statement yang memanggil function atau method
        System.out.println("Hello");

        // object creation statement = statement yang membuat object baru
        Date date = new Date();
    }
}
