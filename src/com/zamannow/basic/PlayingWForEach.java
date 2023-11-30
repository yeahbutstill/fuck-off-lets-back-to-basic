package com.zamannow.basic;

import java.util.Arrays;

public class PlayingWForEach {
    public static void main(String[] args) {
        // manual
        String[][] kota = { // array di dalam array
                {"Depok", "Citayam", "Bogor", "Bandung", "Makasar"},
                {"Cirebon", "Cepu", "Sialan"}
        };

        // index = 0 karena array itu dimulai dari 0
        // < bukan <= Ingat karena kita tidak sampai total, karena index array dari 0 kalau adanya 6 maka panjang index dikurang 1 = 5
        for (int i = 0; i < kota.length; i++) {
            // array di ambil index i
            System.out.println(Arrays.toString(kota[i]));
        }

        System.out.println("====================================");

        // automatis
        String[] anime = {"Naruto", "Jujutsu Kaisen", "Dragon Ball", "Demon Slayer"};
        for (String key : anime) {
            System.out.println(Arrays.toString(key.toCharArray()));
            System.out.println(key);
        }
    }
}
