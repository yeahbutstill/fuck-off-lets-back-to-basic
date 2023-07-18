package com.mazeeko.standardclasses;

/**
 * Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number
 * Class number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
 * Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya
 */
public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(shortValue);


        /**
         * Konversi String ke Number
         * Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke number
         * parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitif
         * valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitif
         * Method ini akan throw NumberFormatException(Errornya akan runtime, jadi tidak perlu try catch) jika ternyata gagal melakukan konversi String ke number
         */
        String contohString1 = "10000";
        String contohString2 = "1000";
        Integer contohInteger = Integer.valueOf(contohString1);
        int contohInt = Integer.parseInt(contohString2);

        System.out.println(contohInteger);
        System.out.println(contohInt);



    }
}
