package com.dicoding.javafundamental.basic.strukturdasar.tipedata.playwithstring;

public class StringTrimTest2 {
    public static void main(String[] args) {
        String s1 = "   Geeks For Geeks   ";

        // Before Trim() method
        System.out.println("Before Trim() - ");
        System.out.println("String - " + s1);
        System.out.println("Length - " + s1.length());

        // applying trim() method on string s1
        s1 = s1.trim();

        // After Trim() method
        System.out.println("\nAfter Trim() - ");
        System.out.println("String - " + s1);
        System.out.println("Length - " + s1.length());

    }
}
