package com.dicoding.javafundamental.basic.strukturdasar.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";

        System.out.println("List heroes : ");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("\t index-" + i + " = " + heroes[i]);
        }

        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambah object ke list
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // object lainnya masih bisa terus ditambahkan ke list

        System.out.println("List planets awal : ");
        for (int i = 0; i < planets.size(); i++) { // method size() untuk mendapatkan ukuran list
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari list

        System.out.println("List planets akhir : ");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

    }
}
