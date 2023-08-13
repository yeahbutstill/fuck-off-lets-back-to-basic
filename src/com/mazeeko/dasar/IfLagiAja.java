package com.mazeeko.dasar;

import java.util.Locale;

public class IfLagiAja {
    public static void main(String[] args) {
        // Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan
        // Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi

        String s = "hey";
        String ss = "hoo";

        // if expression
        if (s.toUpperCase().equalsIgnoreCase("hey") || ss.toUpperCase().equalsIgnoreCase("hoo")) {
            System.out.println("Goooooo");
        } else {
            System.out.println("Hufff");
        }

    }
}
