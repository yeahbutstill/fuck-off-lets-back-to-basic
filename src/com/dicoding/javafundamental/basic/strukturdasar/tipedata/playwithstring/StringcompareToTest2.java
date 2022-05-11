package com.dicoding.javafundamental.basic.strukturdasar.tipedata.playwithstring;

public class StringcompareToTest2 {
    public static void main(String[] args) {
        // Initializing Strings
        String str1 = "geeks";
        String str2 = "gEEkS";

        // Checking if geeksforgeeks string
        // equates to geeksforgeeks string
        // case sensitive
        System.out.print(
                "Difference of geeks and gEEkS (case sensitive) : ");
        System.out.println(str1.compareTo(str2));

        // Checking if geeksforgeeks string
        // equates to astha string
        // case insensitive
        // using compareToIgnoreCase()
        System.out.print(
                "Difference of geeks and gEEkS (case insensitive) : ");
        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
