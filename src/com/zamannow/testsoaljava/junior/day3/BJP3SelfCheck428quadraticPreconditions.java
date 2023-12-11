package com.zamannow.testsoaljava.junior.day3;

public class BJP3SelfCheck428quadraticPreconditions {
    public static void main(String[] args) {
        quadratic(1, -7, 12);
        System.out.println();
        quadratic(1, 3, 2);
    }

    private static void quadratic(int a, int b, int c) {
        double sqrt = Math.pow(b, 2) - 4 * a * c;
        if (sqrt < 0) {
            throw new IllegalArgumentException();
        } else if (a == 0) {
            throw new IllegalArgumentException();
        }

        double root1 = (-b + Math.sqrt(sqrt)) / (2*a);
        double root2 = (-b - Math.sqrt(sqrt)) / (2*a);

        System.out.println("First root = " + root1);
        System.out.println("Second root = " + root2);
    }
}
