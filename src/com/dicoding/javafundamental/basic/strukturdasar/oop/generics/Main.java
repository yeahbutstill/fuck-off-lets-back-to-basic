package com.dicoding.javafundamental.basic.strukturdasar.oop.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList(); // List tanpa type-parameter
        list.add("list - String 1"); // list menampung objek String
        list.add(new Planet("Mercury", 0.06)); // list menampung objek Planet

//        for (Object o : list) {
//            Planet planet = (Planet) o; // perlu type-casting dari Object ke Planet
//            planet.print();
//        }

        List<Planet> planetList = new ArrayList(); // List dengan type-parameter Planet
        //planetList.add("planetList - String 1"); // baris ini compile-error, planetList tidak diijinkan menampung objek String
        planetList.add(new Planet("Mercury", 0.06)); // planetList menampung objek Planet
        planetList.add(new Planet("Venus", 0.82));

        for (Planet planet : planetList) {
            planet.print();
        }

    }
}

/**
 * Dari kode di atas terlihat List<Planet> lp tidak diizinkan menampung objek selain Planet.
 * Dalam kasus ini List<Planet> lp dilindungi compile-time type safety di mana jika ada objek lain yang dimasukkan ke List<Planet> lp .
 * Tetapi dengan tipe selain Planet , seketika compile error, Artinya deteksilah lebih dahulu sebelum runtime (program dijalankan).
 * Bandingkan dengan List lo yang bisa menampung objek String ataupun Planet (bahkan semua jenis objek).
 * Sebagai contoh, kita ingin loop kedua List tersebut untuk memanggil method print dari class Planet.
 */