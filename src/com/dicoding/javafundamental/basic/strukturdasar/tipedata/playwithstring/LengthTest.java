package com.dicoding.javafundamental.basic.strukturdasar.tipedata.playwithstring;

public class LengthTest {
    public static void main(String[] args) {
        String name = "Dani Setiawan";
        Integer resultLength = name.length(); // BUKAN dihitung berdasarkan index
        Character resultCharAt = name.charAt(12);
        

        System.out.println(resultLength);
        System.out.println(resultCharAt);
    }
}
