package com.zamannow.testsoaljava.junior.day1;

public class LastDigitExpression {
    public static void main(String[] args) {
        int numbers = 1234;
        int result1 = numbers % 10;
        int result2 = (numbers /10) % 10;
        int result3 = (numbers / 100) % 10;
        int result4 = (numbers / 1000) % 10;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
