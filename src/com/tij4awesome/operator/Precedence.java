package com.tij4awesome.operator;

public class Precedence {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int a = x + y - 2/2 + z; // (1)
        int b = x + (y - 2)/(2 + z); // (2)
        System.out.println("a = " + a + " b = " + b);
    }
}
