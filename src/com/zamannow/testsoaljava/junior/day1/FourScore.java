package com.zamannow.testsoaljava.junior.day1;

public class FourScore {
    public static void main(String[] args) {
        String quote = "Four score and seven years ago";
        int a = 5;
        int b = 10;
        int c = 0;
        int d = 4;
        int e = 21;
        int f = 26;
        String expr1 = quote.substring(a, b).toUpperCase(); // SCORE
        String expr2 = quote.toLowerCase().substring(c, d) + quote.substring(e, f); // fouryears

        System.out.println(expr1);
        System.out.println(expr2);
    }
}
