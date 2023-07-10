package com.mazeeko.oop.staticmethod;

public class MathUtil {
    // int titik 3(...) itu adalah variable argument
    public static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
