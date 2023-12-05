package com.zamannow.testsoaljava.junior.day1;

public class Displacement {
    public static void main(String[] args) {
        double s0 = 12.0;
        double v0 = 3.5;
        double a = 9.8;
        int t = 10;
        double s = s0 + v0 * t + a * t * t / 2;
        System.out.println(s);
    }
}
