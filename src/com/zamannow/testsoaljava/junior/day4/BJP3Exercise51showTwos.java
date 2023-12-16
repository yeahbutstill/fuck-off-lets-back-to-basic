package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise51showTwos {
    public static void main(String[] args) {
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
        showTwos(-10);
        showTwos(-32);
    }

    private static void showTwos(int n) {
        System.out.print(n + " = ");
        while (n % 2 == 0) {
            System.out.print("2 * ");
            n /= 2;
        }
        System.out.print(n);
        System.out.println();
    }
}
