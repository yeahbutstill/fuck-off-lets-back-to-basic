package com.zamannow.stdclass;

public class TestNumber {
    public static void main(String[] args) {
        Integer integerValue = 1000000000;
        System.out.println(integerValue);

        Long longValue = integerValue.longValue();
        System.out.println(longValue + 102222);

        Double doubleValue = longValue.doubleValue();
        System.out.println(doubleValue + 101111);

        // tetep ke botong hasil angkanya menyesuaikan balikan tipe -> Integer
        Integer balikLagi = doubleValue.intValue();
        System.out.println(balikLagi);

        // ini kalau value stringnya bukan anggka sesuai dengan tipe balikan konversinya, maka dia error kena NumberFormatException
        String contoh = "10000";
        // non primitive
        Integer contohInteger = Integer.valueOf(contoh);
        System.out.println(contohInteger);
        // primitive
        int contohInt = Integer.parseInt(contoh);
        System.out.println(contohInt);
    }
}
