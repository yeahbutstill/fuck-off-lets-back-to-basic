package com.tij.operators;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Hexadecimal (lowercase)
        int i2 = 0x2F; // Hexadecimal (uppercase)
        int i3 = 0177; // Octal (leading zero)
        char c = 0xffff; // Max char hex value
        byte b = 0x7f; // Max byte hex value
        short s = 0x7fff; // Max short hex value
        long n1 = 200L; // Long suffix
        long n2 = 200l; // Long suffix (but can be confusing)
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F; // Float suffix
        float f3 = 1f; // Float suffix
        double d1 = 1d; // Double suffix
        double d2 = 1D; // Double suffix
        // (Hex and Ocatal also work with long)

        System.out.println("i1: " + Integer.toBinaryString(i1));
        System.out.println("i2: " + Integer.toBinaryString(i2));
        System.out.println("i3: " + Integer.toBinaryString(i3));
        System.out.println("c: " + Integer.toBinaryString(c));
        System.out.println("b: " + Integer.toBinaryString(b));
        System.out.println("s: " + Integer.toBinaryString(s));
    }
}
