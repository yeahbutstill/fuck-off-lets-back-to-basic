package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck516isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(24));
        System.out.println(isPrime(17));
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
