package com.zamannow.testsoaljava.junior.day1;

public class TimesOperator {
    public static void main(String[] args) {
        // y = 12.3x4 - 9.1x3 + 19.3x2 - 4.6x + 34.2
        int x = 9;
        double y = x * (x * (x * (x * 12.3 - 9.1) + 19.3) - 4.6) + 34.2;
        System.out.println(y);

    }
}
