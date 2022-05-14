package com.dicoding.javafundamental.basic.strukturdasar.oop.propertimetode;

public class Hewan {
    // Properti atau fields
    // Inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    // Inisiasi melalui konstruktor
    int umur;

    Hewan(int umur) {
        this.umur = umur;
    }

    // Konstruktor dengan parameter
//    Hewan(int umurParam) {
//        umur = umurParam;
//    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur() {
        return umur;
    }

    /**
     * Kode this mereferensikan objek yang sedang digunakan.
     * Pemanggilan this ada di dalam konstruktor kelas Hewan.
     * Artinya nilai this mereferensikan objek Hewan.
     * Kesimpulannya kode this.umur adalah akses ke atribut umur kelas Hewan dalam kelas Hewan.
     */

    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan() {
        System.out.println("Berjalan dengan pelan..");
    }

    void makan() {
        System.out.println("Makan dengan menggunakan mulut..");
    }

}
