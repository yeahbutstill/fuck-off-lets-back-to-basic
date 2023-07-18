package com.mazeeko.standardclasses;

import java.util.StringTokenizer;

/**
 * StringTokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token atau
 * string yang lebih kecil
 * Kita bisa memotong String dengan delimiter yang kita mau
 */
public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Yeah but still";
        // pastikan delimternya ada
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
