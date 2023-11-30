package com.zamannow.basic;

public class PlayingWithBreakCountinue {
    public static void main(String[] args) {

        int counter = 0;
        while (true) {
            System.out.println("Perulangan ke - " + counter);
            counter++;
            if (counter >= 10) {
                break; // hentikan seluruh perulangan
            }
        }

        System.out.println("Perulangan berheti");
        System.out.println();
        System.out.println();
        System.out.println("=========================");

        int counterLagi = 10;
        for (int i = 0; i <= counterLagi; i++) {
            if (i % 2 == 0) {
                continue; // lanjutkan ke perulangan berikutnya
            }
            System.out.println("perulangan " + i);
        }
    }
}
