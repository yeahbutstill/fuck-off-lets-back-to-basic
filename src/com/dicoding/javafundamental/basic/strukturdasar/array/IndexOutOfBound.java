package com.dicoding.javafundamental.basic.strukturdasar.array;

public class IndexOutOfBound {
    public static void main(String[] args) {
        int[] arrA = {1, 2, 3, 4};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);
        System.out.println(arrA[3]);
        // Ini adalah eror yang disebabkan oleh percobaan saat melakukan akses indeks yang tidak dimiliki oleh array.
        // Misalnya kita melakukan akses pada indeks 4 sedangkan array tersebut hanya memiliki 4 elemen.
        // Ingatlah bahwa indeks dimulai dari 0 dan indeks terakhir adalah panjang element - 1.
        // Agar Anda semakin paham, mari kita coba praktikan!
        System.out.println(arrA[4]);
    }
}
