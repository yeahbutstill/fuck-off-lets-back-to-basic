package com.zamannow.testsoaljava.junior.day1;

public class OddStuffMain {
    public static void main(String[] args) {
        os();
    }

    public static void os() {
        int number = 4;
        for (int count = 1; count <= number; count++) {
            System.out.println(number);
            number = number / 2;
        }
    }
}
