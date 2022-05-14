package com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier.codelabprotected.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        // Kemudian tes pembuatan objek kelas perhitungan sebanyak 5 kali, seperti di bawah ini.
        for (int x = 0; x < 5; x++) {
            new Perhitungan();
        }
        System.out.println("Sampai " + Perhitungan.nilai);
        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
    }
}
