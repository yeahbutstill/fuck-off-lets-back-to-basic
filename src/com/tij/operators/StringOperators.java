package com.tij.operators;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 2;
        String s = "x, y, z ";

        System.out.println(s + x + y + z);
        System.out.println(x + " " + s); // Converts x to a String

        s += "(summed) = "; // Concatenation operator
        System.out.println(s + (x + y + z));
        System.out.println("" + x); // Shorthand for Integer.toString()
    }
}
