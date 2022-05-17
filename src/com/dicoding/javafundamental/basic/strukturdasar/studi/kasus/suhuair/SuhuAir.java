package com.dicoding.javafundamental.basic.strukturdasar.studi.kasus.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        /**
         * Contoh pemakaian IF tiga kasus Wujud Air
         */

        // Kamus
        int t;

        // program
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu (der. C) = ");

        // scanner untuk masukan suhu air
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt(); // masukan suhu air dengan tipe int

        // proses pengecekan dengan if
        if (t < 0) {
            System.out.println("Wujud air beku " + t);
        } else if ((0 <= t) && (t <= 100)) {
            System.out.println("Wujud air cair " + t);
        } else if (t > 100) {
            System.out.println("Wujud air uap/gas " + t);
        }

    }
}

/**
 * Jika telah menuliskan kode di atas, coba jalankan dengan menekan tombol run.
 * Setelah program di atas dijalankan, maka pada console-nya akan tampil output seperti berikut ini.
 * Kita akan memasukan suhu air. Misalnya kita masukan 20 maka akan keluar hasil bahwa wujud air cair 20.
 * Anda bisa coba masukkan suhu yang lain dan lihat output hasilnya.
 */