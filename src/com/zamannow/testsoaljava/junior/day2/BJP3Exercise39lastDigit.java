package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise39lastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(3572));
        System.out.println(lastDigit(-947));
        System.out.println(lastDigit(6));
        System.out.println(lastDigit(35));
        System.out.println(lastDigit(123456));
    }

    private static int lastDigit(int i) {
        return Math.abs(i % 10);
    }
}
