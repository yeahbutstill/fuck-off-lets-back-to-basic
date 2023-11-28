package com.zamannow.basic;

public class AwTipeData {
    public static void main(String[] args) {
        // Bilangan bulat
        byte iniByte = 127; // max value
        short iniShort = 32_767; // max value
        int iniInt = 2_147_483_647; // max value
        long iniLong1 = 1000; // not max value
        long iniLong2 = 9_223_372_036_854_775_807L; // max value

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong1);
        System.out.println(iniLong2);

        System.out.println();

        // Bilangan pecahan
        float iniFloat = 01.12F;
        double iniDouble = 12.2424;

        System.out.println(iniFloat);
        System.out.println(iniDouble);

        System.out.println();

        // Literals Number
        int hexInt = 0xA132B;
        int binInt = 0b01010101;
        int decimal1 = 660267;
        int decimal2 = 85;

        System.out.println(hexInt);
        System.out.println(binInt);
        System.out.println(decimal1 == hexInt);
        System.out.println(decimal2 == binInt);
    }
}
