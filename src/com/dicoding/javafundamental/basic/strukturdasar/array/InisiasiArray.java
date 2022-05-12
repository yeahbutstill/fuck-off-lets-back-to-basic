package com.dicoding.javafundamental.basic.strukturdasar.array;

/**
 * Untuk inisiasi suatu array, ada 2 cara yang bisa digunakan.
 * <p>
 * Pertama, menggunakan tanda {} (sepasang urung kurawal atau braces/curly brackets) dan memisahkan nilai antar elemen
 * dengan tanda koma.
 */

public class InisiasiArray {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);
        // Cara di atas merupakan salah satu contoh untuk melakukan insialisasi array.

        // Selanjutnya cara kedua dengan melakukan inisiasi array per elemen
        int[] arrInt1 = new int[6];
        arrInt1[0] = 1;
        arrInt1[1] = 2;
        arrInt1[2] = 3;
        arrInt1[3] = 4;
        arrInt1[4] = 5;
        arrInt1[5] = 6;

        System.out.println(arrInt1[0]);
        System.out.println(arrInt1[1]);
        System.out.println(arrInt1[2]);
        System.out.println(arrInt1[3]);
        System.out.println(arrInt1[4]);
        System.out.println(arrInt1[5]);

    }
}


