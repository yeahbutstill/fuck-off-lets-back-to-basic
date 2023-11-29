package com.zamannow.basic;

public class PlayingWithTernaryOperator {
    public static void main(String[] args) {
        // tanpa ternary operator
        Integer nilai = 55;
        String ucapan;
        if (nilai >= 75) {
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Maaf anda masih bodoh";
        }

        System.out.println(ucapan);
        System.out.println("===========================================");

        // menggunakan ternary operator
        Integer nilaiLagi = 80;
        String ucapanLagi = nilaiLagi >= 75 ? "Selamat anda lulus" : "Blog!";
        System.out.println(ucapanLagi);
    }
}
