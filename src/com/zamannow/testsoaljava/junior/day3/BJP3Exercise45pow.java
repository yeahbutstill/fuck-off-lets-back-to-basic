package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise45pow {
    public static void main(String[] args) {
        System.out.println(pow(3, 4));
    }

    private static int pow(int base, int pow) {
        int sol = 1;
        for (int a = 0; a < pow; a++) {
            sol *= base;
        }
        return sol;
    }
}
