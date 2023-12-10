package com.zamannow.testsoaljava.junior.day3;

public class BJP3SelfCheck415sumTo {
    public static void main(String[] args) {
        System.out.println(sumTo(5));
    }

    private static int sumTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
