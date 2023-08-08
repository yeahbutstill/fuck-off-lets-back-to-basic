package com.mazeeko.dasar.tipedata.array;

// Index Array itu di mulai dari 0 dan panjangnya di kurang 1
public class ArrayContohAja {
    private final String[] namaBuah = {"Jeruk", "Mangga", "Apel", "Pisang"};
    static Long[] harga = {10_000L, 30_000L, 20_000L, 10_000L, 500_000L};

    public static void main(String[] args) {
        ArrayContohAja acj = new ArrayContohAja();
        for (String s : acj.namaBuah) {
            System.out.println(s);
        }

        Long hargaJeruk = harga[4];
        long l = 0L;
        harga[0] = l;
        System.out.println(hargaJeruk);
        System.out.println(l);

        Integer length = harga.length;
        int length1 = acj.namaBuah.length;
        System.out.println(length.equals(length1));
        System.out.println(length1 == 4);
    }
}
