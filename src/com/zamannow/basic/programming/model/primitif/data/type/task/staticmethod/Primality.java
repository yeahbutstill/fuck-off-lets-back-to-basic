package com.zamannow.basic.programming.model.primitif.data.type.task.staticmethod;

public class Primality {
    public static void main(String[] args) {
        System.out.println(isPrime(100));
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
