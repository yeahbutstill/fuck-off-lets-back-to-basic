package com.zamannow.testsoaljava.junior.day1;

public class MysteryNums {
    public static void main(String[] args) {
        int x = 15;
        sentence(x, 42);

        int y = x - 5;
        sentence(y, x + y);

    }

    private static void sentence(int num, int num1) {
        System.out.println(num + " " + num1);
    }
}
