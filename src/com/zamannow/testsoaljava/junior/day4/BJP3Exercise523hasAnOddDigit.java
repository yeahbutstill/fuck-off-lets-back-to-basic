package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise523hasAnOddDigit {
    public static void main(String[] args) {
        System.out.println(hasAnOddDigit(4822116));
        System.out.println(hasAnOddDigit(2448));
        System.out.println(hasAnOddDigit(-7004));
    }

    private static boolean hasAnOddDigit(int num) {
        if (num == 0) {
            return false;
        } else {
            num = Math.abs(num);
            while (num != 0) {
                int digit = num % 10;
                if (digit % 2 != 0) {
                    return true;
                }
                num /= 10;
            }

            return false;
        }
    }
}
