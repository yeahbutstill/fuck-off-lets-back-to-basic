package com.leetcode.ch1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * R-1.1
 * Tulis metode Java singkat, inputAllBaseTypes, yang memasukkan nilai yang berbeda dari setiap tipe dasar dari input standar
 * perangkat dan mencetaknya kembali ke perangkat output standar.
 */
public class Main {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }

    private static void inputAllBaseTypes() {
        Scanner stdIn = new Scanner(System.in);
        List<Object> list = new ArrayList<>();

        // basic types: int, short, long, char, byte, boolean float, double
        short aShort = stdIn.nextShort();
        int aInt = stdIn.nextInt();
        long aLong = stdIn.nextLong();
        char aChar = stdIn.next().charAt(0);
        byte aByte = stdIn.nextByte();
        boolean aBoolean = stdIn.nextBoolean();
        float aFloat = stdIn.nextFloat();
        double aDouble = stdIn.nextDouble();

        list.add(aShort);
        list.add(aInt);
        list.add(aLong);
        list.add(aChar);
        list.add(aByte);
        list.add(aBoolean);
        list.add(aFloat);
        list.add(aDouble);
    }
}
