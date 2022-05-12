package com.dicoding.javafundamental.basic.strukturdasar.oop.obyek;

public class Main {
    public static void main(String[] args) {
        // menciptakan object dengan nama 'objectHewan'
//        Hewan objectHewan = new Hewan();
//        objectHewan.cetakNama("Elang");
        Hewan elang = new Hewan("Elang");
        Hewan kucing = new Hewan("Kucing");

        elang.beratHewan(5);
        elang.jumlahKakiHewan(2);
        elang.cetakHewan();

        kucing.beratHewan(2);
        kucing.jumlahKakiHewan(4);
        kucing.cetakHewan();

    }
}
