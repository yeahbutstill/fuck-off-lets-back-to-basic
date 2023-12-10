package com.zamannow.testsoaljava.junior.day3;

public class BJP3SelfCheck416countFactors {
    public static void main(String[] args) {
        System.out.println(countFactors(12));
    }

    private static int countFactors(int n) {
        int factor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factor++;
            }
        }
        return factor;
    }
}
