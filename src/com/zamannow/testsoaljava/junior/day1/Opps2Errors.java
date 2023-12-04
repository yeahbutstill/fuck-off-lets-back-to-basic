package com.zamannow.testsoaljava.junior.day1;

public class Opps2Errors {
    public static void main(String[]args) {
        int x = 0;
        System.out.println("x is " + x);

        x = (int) 15.2;
        System.out.println("x is now " + x);

        int y;
        y = x + 1;
        System.out.println("x and y are " + x + " and " + y);
    }
}
