package com.zamannow.testsoaljava.junior.day3;

public class IfElseMystery2 {
    public static void main(String[] args) {
        ifElseMystery2(10, 2);
        ifElseMystery2(3, 8);
        ifElseMystery2(4, 4);
        ifElseMystery2(10, 30);
    }

    public static void ifElseMystery2(int a, int b) {
        if (a * 2 < b) {
            a = a * 3;
        }

        if (b < a) {
            b++;
        } else {
            a--;
        }

        System.out.println(a + " " + b);
    }
}
