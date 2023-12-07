package com.zamannow.testsoaljava.junior.day1;

public class Oops3Errors {
    public static void main(String[] args) {
        double bubble = 867.5309;
        double x = 10.01;
        int z = 5;
        printer(x, (double) z + 3);
        printer(x, bubble);
        System.out.println("The value from main is: " + bubble);
        System.out.println("z = " + z);

    }

    private static void printer(double x, double y) {
        System.out.println("x = " + x + " and y = " + y);

    }
}
