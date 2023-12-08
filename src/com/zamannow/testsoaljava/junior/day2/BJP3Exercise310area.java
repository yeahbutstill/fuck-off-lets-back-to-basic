package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise310area {
    public static void main(String[] args) {
        System.out.println(area(2.0));
    }

    private static double area(double r) {
        // PI * r^2
        return Math.PI * Math.pow(r, 2);
    }
}
