package com.mazeeko.dasar;

import java.util.Date;

// Statement bisa dibilang adalah kalimat lengkap dalam bahasa.
// sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma
public class ContohStatement { // block adalah kumpulan statement yang terdiri dari nol atau lebih
    public static void main(String[] args) { // block statement
        // ada beberapa jenis statement
        // Assignment expression
        // Penggunaan ++ dan --
        // Method invocation
        // Object creation expression


        // Expression adalah core component dari statement
        int value; // expression
        value = 10; // expression

        // ini statement (expression) bisa dibilang statement adalah kumpulan expression
        System.out.println(value = 100);


        // assigment statement, artinya yang mengubah value
        double aValue = 999.99;

        // increment statement
        aValue++;

        // method invocation statement, artinya yang memanggil method atau function
        System.out.println("Hello");

        // object creation statement, artinya pembuatan object baru
        Date date = new Date();
    }
}
