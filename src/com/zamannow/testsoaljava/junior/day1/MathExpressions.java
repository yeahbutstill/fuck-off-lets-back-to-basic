package com.zamannow.testsoaljava.junior.day1;

public class MathExpressions {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1.6));
        System.out.println(Math.abs(2 + -4));
        System.out.println(Math.pow(6, 2));
        System.out.println(Math.pow((double) 5 / 2, 6));
        System.out.println(Math.ceil(9.1));
        System.out.println(Math.ceil(115.8));
        System.out.println(Math.max(7, 4));
        System.out.println(Math.min(8, 3 + 2));
        System.out.println(Math.min(-2, -5));
        System.out.println(Math.sqrt(64));
        System.out.println(8.0 * 8.0);
        System.out.println(Math.sqrt(76 + 45));
        System.out.println(11.0 * 11.0);
        System.out.println("----------------------------------------");
        System.out.println(Math.log10(100));
        System.out.println(100 + Math.log10(100));
        System.out.println(13 + Math.abs(-7) - Math.pow(2, 3) + 5);
        System.out.println(Math.sqrt(16) * Math.max(Math.abs(-5), Math.abs(-3)));
        System.out.println(7 - 2 + Math.log10(1000) + Math.log(Math.pow(Math.E, 5)));
        System.out.println(Math.max(18 - 5 + Math.random(), Math.ceil(4.6 * 3)));
    }
}
