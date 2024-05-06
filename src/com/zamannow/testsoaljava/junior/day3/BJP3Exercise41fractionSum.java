package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise41fractionSum {
    public static void main(String[] args) {
        System.out.println(fractionSum(1));
    }

    private static double fractionSum(int n) {
        double sum = 0;
        for (double a = 0; a < n; a++) {
            sum += 1 / (a + 1);
        }
        return sum;
    }
}
