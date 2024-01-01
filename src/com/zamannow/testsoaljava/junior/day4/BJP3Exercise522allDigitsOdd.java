package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise522allDigitsOdd {
    public static void main(String[] args) {
        System.out.println(allDigitsOdd(4822116));
    }

    private static boolean allDigitsOdd(int num) {
        boolean result = true;
        num = Math.abs(num);
        if (num == 0) {
            result = false;
        }

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                result = false;
            }
            num /= 10;
        }
        return result;
    }
}
