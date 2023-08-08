package com.mazeeko.dasar.tipedata.array;

public class Array {
    public static void main(String[] args) {
        var stringArray = new String[] {"A", "B", "C"}; // array tipe datanya wajib harus sama
        String[] stringArray2 = new String[10]; // panjang index element dimulai dari 0, sehinggap panjang aray dikurang 1 (10 -1) 9 index

        // mengubah data yang ada didalam array nya
        stringArray2[0] = "Dani";
        stringArray2[1] = "Setiawan";
        stringArray2[2] = "Maya";
        stringArray2[3] = "Triyanti";

        // memanggilnya data di array
        System.out.println(stringArray2[0]);
        System.out.println(stringArray2[2]);

        // menampilkan panjang array
        System.out.println(stringArray2.length); // panjang max array
        System.out.println(stringArray.length); // panjang max array

        // menghapus data array, kalau di java itu tidak ada istilah menghapus data array
        // kenapa? karena kalau menghapus kan yang tadinya panjangnya 10 jadi 9. yang ada itu mungkin
        // memasukan data kosong
        stringArray2[0] = null;
        System.out.println(stringArray2[0]);

        // banyak sekali cara untuk initialisasi array
        int[] arrInt = new int[]{1, 2, 3, 4, 5, 6};
        long[] arrLong = {1, 2, 3, 4, 5, 6};

    }
}
