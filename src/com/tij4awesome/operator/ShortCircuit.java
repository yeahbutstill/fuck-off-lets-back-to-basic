package com.tij4awesome.operator;

/***
 * operators/ShortCircuit.java
 * Demonstrates short-circuiting behavior
 * with logical operators
 */
public class ShortCircuit {
    static boolean test1(int val1) {
        System.out.println("test1(" + val1 + ")");
        System.out.println("result: " + (val1 < 1));
        return val1 < 1;
    }

    static boolean test2(int val2) {
        System.out.println("test2(" + val2 + ")");
        System.out.println("result: " + (val2 < 1));
        return val2 < 2;
    }

    static boolean test3(int val3) {
        System.out.println("test3(" + val3 + ")");
        System.out.println("result: " + (val3 < 1));
        return val3 < 3;
    }

    public static void main(String[] args) {
        boolean b = test3(2);
//        test1(0) && test2(2) && b
    }
}
