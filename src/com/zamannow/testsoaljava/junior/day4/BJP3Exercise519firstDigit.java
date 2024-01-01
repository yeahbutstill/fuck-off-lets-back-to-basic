package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise519firstDigit {
    public static void main(String[] args) {
        System.out.println(firstDigit(3572));
    }

    private static int firstDigit(int i) {
        i = Math.abs(i);
        while (i / 10 != 0) {
            i /= 10;
        }
        return i;
    }
}
