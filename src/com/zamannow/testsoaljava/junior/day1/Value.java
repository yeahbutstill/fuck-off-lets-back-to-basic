package com.zamannow.testsoaljava.junior.day1;

public class Value {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = b;
        a = a + 1;
        b = b - 1;
        c = c + a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
