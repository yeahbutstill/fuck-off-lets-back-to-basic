package com.zamannow.testsoaljava.junior.day1;

public class MathExpressions2 {
    public static void main(String[] args) {
        double grade = 2.7;
        Math.round(grade);
        grade = Math.round(grade);
        System.out.println(grade);

        double min = Math.min(grade, Math.floor(2.9));
        System.out.println(min);

        double x = Math.pow(2, 4);
        System.out.println(x);
        x = Math.sqrt(64);
        System.out.println(x);

        int count = 25;
        Math.sqrt(count);
        count = (int) Math.sqrt(count);
        System.out.println(count);

        int a = Math.abs(Math.min(-1, -3));
        System.out.println(a);
    }
}
