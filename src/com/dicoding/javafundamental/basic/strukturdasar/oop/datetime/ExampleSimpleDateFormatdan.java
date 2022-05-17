package com.dicoding.javafundamental.basic.strukturdasar.oop.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormatdan {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormated = sdf.format(new Date());
        System.out.println("Format tanggal default : " + new Date());
        System.out.println("Format tanggal dengan format : " + dateFormated);

        /**
         * Saat inisialisasi SimpleDateFormat, kita wajib mengisi parameter pattern.
         * Pattern ini ("dd/M/yyyy") nantinya dijadikan acuan output dari waktu tanggal yang akan diparsing.
         * Kita melakukan inisialisasi atas SimpleDateFormat new SimpleDateFormat("dd/M/yyyy").
         * Artinya output akan menampilkan (tanggal dalam 2 digit) / (Bulan 1 digit ) / (Tahun 4 digit).
         */
    }
}
