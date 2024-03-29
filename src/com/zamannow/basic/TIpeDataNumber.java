package com.zamannow.basic;

public class TIpeDataNumber {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1_000;
        int iniInt = 1_000_000_000;
        long iniLong = 1_000_000_000_000_000_000L;
        float iniFloat = 10.10F;
        double iniDouble = 10.10;
        int decimalInt = 34;
        int hexaDecimalInt = 0xFFF;
        int binaryDecimal = 0b1010;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(decimalInt);
        System.out.println(hexaDecimalInt);
        System.out.println(binaryDecimal);
    }
}
