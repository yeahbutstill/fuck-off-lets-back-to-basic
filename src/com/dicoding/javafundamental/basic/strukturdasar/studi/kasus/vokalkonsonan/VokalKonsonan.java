package com.dicoding.javafundamental.basic.strukturdasar.studi.kasus.vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {

    private static int numKonsonan(String word) {
        int i;
        int jumlahKonsonan = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' ') {
                jumlahKonsonan++;
            }
        }
        return jumlahKonsonan;
    }

    //coba membuat fungsi baru. Buat 2 fungsi statis untuk menghitung huruf konsonan dan vokal dengan nama numVokal dan numKonsonan.
    private static int numVokal(String word) {
        int i;
        int jumlahVokal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }

    public static void main(String[] args) {
        // kamus
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        /**
         * program
         * masukan kalimat
         */
        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();

        // memanggil prosedur yang mengembalikan nilai int
        vokal = numVokal(word);
        konsonan = numKonsonan(word);

        System.out.println("Jumlah huruf vokal : " + vokal);
        System.out.println("Jumlah huruf konsonan : " + konsonan);
    }
}
