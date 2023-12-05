package com.zamannow.testsoaljava.junior.day1;

public class NumberTriangle {
    public static void main(String[] args) {
        for (int line = 1; line <= 7; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(line);
            }
            System.out.println();
        }
    }
}
