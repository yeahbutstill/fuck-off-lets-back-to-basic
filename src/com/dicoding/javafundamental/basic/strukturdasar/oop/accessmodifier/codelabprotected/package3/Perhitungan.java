package com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier.codelabprotected.package3;

public class Perhitungan {
    public static int nilai = 0;

    /**
     * Dan perlu diketahui juga bahwa static variable hanya berjumlah satu,
     * tak  peduli berapapun obyek yang dibuat.
     * Sebagai contoh kita modifikasi kelas Perhitungan dengan menambahkan konstruktor, seperti di bawah ini.
     */

    Perhitungan() {
        nilai++;
    }

    protected static int getNilai() {
        return nilai;
    }
}
