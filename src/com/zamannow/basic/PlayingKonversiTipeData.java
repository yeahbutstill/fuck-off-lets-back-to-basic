package com.zamannow.basic;

public class PlayingKonversiTipeData {
    public static void main(String[] args) {
        byte iniByte = 127;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        System.out.println("Widening Casting (Automatis karena mengikuti max value dari tipe data yang nampungnya): dari byte -> short -> int -> long -> float -> double " + iniDouble);
        System.out.println();

        float iniFloat1 = (float) iniDouble;
        long iniLong1 = (long) iniFloat1;
        int iniInt1 = (int) iniLong1;
        short iniShort1 = (short) iniInt1;
        byte iniByte1 = (byte) iniShort1;

        System.out.println("Narrowing Casting: dari double -> float -> long -> int -> short -> byte " + iniByte1);
        System.out.println();

        // pakai dengan bijak kalau engga nanti kena number overflow
        double doubleTakeCare = 1000000000L;
        short shortTakeCare = (short) doubleTakeCare;
        System.out.println(shortTakeCare);
    }
}
