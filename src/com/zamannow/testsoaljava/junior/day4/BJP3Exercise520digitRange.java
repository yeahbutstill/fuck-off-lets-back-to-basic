package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise520digitRange {
    public static void main(String[] args) {
        System.out.println(digitRange(68437));
    }

    private static int digitRange(int i) {
        i = Math.abs(i);
        int min = 10;
        int max = 0;
        if (i / 10 == 0) {
            return 1;
        }

        while (i != 0) {
            int digit = i % 10;
            i /= 10;
            if (digit > max) {
                max = digit;
            } else if (digit < min) {
                min = digit;
            }
        }

        return max - min + 1;
    }
}
