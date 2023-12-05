package com.zamannow.testsoaljava.junior.day1;

public class SpacesAndNumbers {
    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++) {
            // for spacing
            for (int b = 4; b >= a; b--) {
                System.out.print(" ");
            }

            // for numbers
            for (int c = 1; c <= a; c++) {
                System.out.print(a);
            }

            System.out.println();
        }
    }
}
