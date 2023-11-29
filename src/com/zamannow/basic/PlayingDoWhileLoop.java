package com.zamannow.basic;

public class PlayingDoWhileLoop {
    public static void main(String[] args) {
        // jadi ini kalau temen-temen butuh kasus perulangannya butuh 1 kali, misalnya seperti nampilin menu program, itu kan minal ditampilin dulu 1 kali, setelah itu
        // tergantung pilihan usernya, kalau pilih next menu. baru tampilkan lagi, kalau engga ya berarti udah kelar dan selesai
        int counter = 100;
        do {
            System.out.println("Perulangan ini akan ini akan dieksekusi terlebih dahulu.... ke - " + counter);
            counter++;
        } while (counter <= 10);
    }

}
