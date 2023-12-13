package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise414pow2 {
    public static void main(String[] args) {
        System.out.println(pow2(2.0, -2));
    }

    private static double pow2(double base, int power) {
        double total = 1;
        for (int a = 0; a < Math.abs(power); a++) {
            total *= base;
        }

        if (power < 0) total = 1 / total;

        return total;
    }
}
