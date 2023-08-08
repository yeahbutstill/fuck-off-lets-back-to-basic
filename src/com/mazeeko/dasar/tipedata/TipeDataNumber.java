package com.mazeeko.dasar.tipedata;
public class TipeDataNumber {
    public static void main(String[] args){

        // integer
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 100_000;
        long iniLong = 1_000_000_000;
        long iniLong2 = 1_000_000_000_000L; // underscore ini biasanya cuman untuk pemisah diangka biar engga bingung baca angkanya

        // konversi automatis AKA Widening Casting: byte->short->int->long->float->double
        byte iniByte2 = 10;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;
        long iniLong3 = iniInt2;
        float iniFloat2 = iniLong3;
        double iniDouble2 = iniFloat2;

        // konversi manual AKA Narrowing Casting: double->float->long->int->char->short->byte
        float iniFloat3 = (float) iniDouble2;
        long iniLong4 = (long) iniFloat3;
        int iniInt3 = (int) iniLong4;
        short iniShort3 = (short) iniInt3;

        // hati-hati ketika konveri manual. ini akan kena number overflow
        // ketika konversi dari yang paling besar ke paling kecil
        int iniInt4 = 1_000;
        byte iniByte4 = (byte) iniInt4;
        System.out.println(iniByte4);


        // floating point
        float iniFloat = 10.5f;
        double iniDouble = 10.5;

        // literals
        int decimalInt = 25;
        int hexadecimalInt = 0xA132B;
        int binaryInt = 0b01010101;
        //! int binaryInt = 0b010101014; // ini error karena 4 bukan angka binary


    }
}
