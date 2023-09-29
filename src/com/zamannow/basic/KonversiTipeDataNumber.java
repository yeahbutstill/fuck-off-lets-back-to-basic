package com.zamannow.basic;

public class KonversiTipeDataNumber {
  public static void main(String[] args) {
    // Widening Casting (otomatis): byte->short->int->long->float->double, karena tipe data
    // maximumnya naik
    byte iniByte = 10;
    short iniShort = iniByte;
    int iniInt = iniShort;
    long iniLong = iniInt;
    float iniFloat = iniLong;
    double iniDouble = iniFloat;
    System.out.println(iniDouble);

    // Narrowing Casting (manual): double->float->long->int->char->short->byte
    float iniFloat2 = (float) iniDouble;
    long iniLong2 = (long) iniFloat;
    int iniInt2 = (int) iniLong2;
    char iniChar = (char) iniInt2;
    short iniShort2 = (short) iniChar;
    byte iniByte2 = (byte) iniShort2;
    int iniInt3 = 1000000000;
    short kepotong = (short) iniInt3;
    System.out.println(iniByte2);
    System.out.println(kepotong);
  }
}
