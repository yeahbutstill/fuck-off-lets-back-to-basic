package com.zamannow.basic;

public class TestContinue {
    public static void main(String[] args) {
        // ganjil
        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil - " + counter);
        }

        System.out.println("=======================");

        // genap
        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 1) {
                continue;
            }
            System.out.println("Perulangan Genap - " + counter);
        }
    }
}
