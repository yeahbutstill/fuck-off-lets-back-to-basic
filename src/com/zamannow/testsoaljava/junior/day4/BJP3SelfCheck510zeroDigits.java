package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck510zeroDigits {
    public static void main(String[] args) {
        System.out.println(zeroDigitsForLoop(5024036));
        System.out.println(zeroDigitsForLoop(0));
        System.out.println(zeroDigitsForLoop(743));
        System.out.println("==========================");
        System.out.println(zeroDigitsDoWhile(5024036));
        System.out.println(zeroDigitsDoWhile(0000000000000000));
        System.out.println(zeroDigitsDoWhile(123));
    }

    private static int zeroDigits(int i) {
        int count = 0;
        do {
            if (i % 10 == 0) count++;
            i /= 10;
        } while (i > 0);

        return count;
    }

    private static int zeroDigitsForLoop(int i) {
        int count = 0;
        String whole = String.valueOf(i);
        for (int h = 0; h < whole.length(); h++) {
            if (whole.charAt(h) == '0') {
                count++;
            }
        }
        return count;
    }

    private static int zeroDigitsDoWhile(int i) {
        int count = 0;
        String whole = String.valueOf(i);
        int h = 0;
        do {
            if (whole.charAt(h) == '0') {
                count++;
            }
            h++;
        } while (h < whole.length());
        return count;
    }
}
