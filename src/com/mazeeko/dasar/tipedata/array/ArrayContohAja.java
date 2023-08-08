package com.mazeeko.dasar.tipedata.array;

// Index Array itu di mulai dari 0 dan panjangnya di kurang 1
public class ArrayContohAja {
    private String[] namaBuah = {"Jeruk", "Mangga", "Apel", "Pisang"};
    Long[] harga = {10_000L, 30_000L, 20_000L, 10_000L, 500_000L};

    public static void main(String[] args) {
        ArrayContohAja acj = new ArrayContohAja();
        for (String s : acj.namaBuah) {
            System.out.println(s);
        }

        Long hargaJeruk = acj.harga[4];
        System.out.println(hargaJeruk);

        Integer length = acj.harga.length;
        Integer length1 = acj.namaBuah.length;
        System.out.println(length.equals(length1));
        System.out.println(length1 == 4);
    }
}
