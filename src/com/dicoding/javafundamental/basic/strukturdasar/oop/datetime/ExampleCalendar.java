package com.dicoding.javafundamental.basic.strukturdasar.oop.datetime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args) {
        // Manpilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());

        /**
         * Seperti halnya pada Date, inisilasisasi Calendar dipanggil dengan Calendar.getInstance().
         * Selanjutnya menampilkan waktu yang sekarang dengan memanggil method yang calendar.getTime().
         * Bila kode di atas dijalankan maka akan tampillah waktu dan tanggal ketika program dieksekusi.
         */
    }
}
