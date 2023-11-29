package com.zamannow.basic;

public class PlayingFor {
    public static void main(String[] args) {
        // tanpa henti
//        for (;;) {
//            System.out.println("Perulangan tanpa henti"); // dead lock atau stuck di sini
//        }

        // perulangan dengan kondisi
        Integer counter = 0;
        for (; counter <= 10;) {
            System.out.println("Yang ke " + counter);
            counter++;
        }
        System.out.println(counter); // ini 11, ketika di cek <= 10 di kondisi for, maka false dan perulangan for akan berhenti

        System.out.println("====================================================");

        // perulangan dengan init statement
        int counterLagi;
        for (counterLagi = 0; counterLagi <= 10;) {
            System.out.println("Perulangan ke - " + counterLagi);
            counterLagi++;
        }
        System.out.println();
        System.out.println("===========================================================");

        // perulangan dengan post statement
        for (Integer counterLagiLagi = 1; counterLagiLagi <= 100; counterLagiLagi++) {
            System.out.println(counterLagiLagi);
            System.out.println(counterLagiLagi.equals(99));
        }



    }
}
