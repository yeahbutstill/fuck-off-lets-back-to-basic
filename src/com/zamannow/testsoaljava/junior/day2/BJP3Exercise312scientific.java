package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise312scientific {
    public static void main(String[] args) {
        System.out.println(scientific(6.23, 5.0));
        System.out.println(scientific(1.9, -2.0));
    }

    private static double scientific(double base, double exponent) {
        double pow = Math.pow(10, exponent);// 10^exponent
        // x*10^exponent
        return base * pow;
    }


}
