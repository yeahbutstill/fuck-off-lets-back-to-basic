package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise38quadratic {
    public static void main(String[] args) {
        quadratic(1, -7, 12);
        quadratic(1, 3, 2);
        System.out.println(Math.pow(4, 0));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.sqrt(100));
    }

    private static void quadratic(int a, int b, int c) {
        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First root = " + root1);
        System.out.println("Second root = " + root2);
    }
}
