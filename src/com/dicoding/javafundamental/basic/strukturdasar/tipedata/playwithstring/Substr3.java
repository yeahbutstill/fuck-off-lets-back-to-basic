package com.dicoding.javafundamental.basic.strukturdasar.tipedata.playwithstring;

public class Substr3 {
    public static void main(String[] args) {
        // Initializing String
        String Str = new String("Rp 1000");

        // Printing original string
        System.out.print("The original string  is : ");
        System.out.println(Str);

        // using substring() to extract substring
        // returns 1000
        System.out.print("The extracted substring  is : ");
        System.out.println(Str.substring(3));
    }
}
