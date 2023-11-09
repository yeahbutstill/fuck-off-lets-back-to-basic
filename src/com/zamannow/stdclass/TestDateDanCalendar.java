package com.zamannow.stdclass;

import java.util.Calendar;
import java.util.Date;

public class TestDateDanCalendar {
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        // Tahun
        calendar.set(Calendar.YEAR, 2023);
        // Bulan
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        // Hari
        calendar.set(Calendar.DAY_OF_MONTH, 9);
        // Jam
        calendar.set(Calendar.HOUR_OF_DAY, 13);
        // Menit
        calendar.set(Calendar.MINUTE, 20);
        // Second
        calendar.set(Calendar.SECOND, 0);
        // Milisecond
        calendar.set(Calendar.MILLISECOND, 0);

        // Konversi Calender ke Date
        Date date = calendar.getTime();
        // Konversi Date ke Millisecond
        Long millisecond = date.getTime();
        System.out.println(millisecond);

        tanggal = new Date(1699510800000L);
        System.out.println(tanggal);
    }
}
