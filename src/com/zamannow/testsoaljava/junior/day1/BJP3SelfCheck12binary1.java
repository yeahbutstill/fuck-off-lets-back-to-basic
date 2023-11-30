package com.zamannow.testsoaljava.junior.day1;


/**
 * Bilangan biner adalah bilangan yang hanya terdiri dari 2 digit: 0 dan 1.
 * Bilangan tersebut dapat dinyatakan dalam sistem bilangan basis 2. Misalnya,
 * 10 (2), 1000 (8), 11001 (25)
 * <p>
 * Bilangan desimal adalah bilangan yang terdiri dari 10 angka: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
 * Dapat dinyatakan dalam sistem bilangan basis 10.
 * 18, 222, 987
 */
public class BJP3SelfCheck12binary1 {
    public static void main(String[] args) {
        BJP3SelfCheck12binary1 bjp3SelfCheck12binary1 = new BJP3SelfCheck12binary1();
        System.out.println(bjp3SelfCheck12binary1.convertDecimalToBinary(10L));
        System.out.println();

        // decimal number
        int decimalNumber = 1000;
        System.out.println(Integer.toBinaryString(decimalNumber));
        System.out.println();

        // binary number
        Long binaryNumber = 1001110L;
        Long decimal = bjp3SelfCheck12binary1.convertBinaryToDecimal(binaryNumber);
        System.out.println("Binary number to decimal");
        System.out.println(binaryNumber + " = " + decimal);

    }

    public Long convertBinaryToDecimal(Long n) {
        long decimalNumber = 0L;
        long remainder;
        long i = 0L;

        while (n != 0) {
            remainder = n % 10;
            n /= 10;
            decimalNumber += (long) (remainder * Math.pow(2, i)); // pangkat
            ++i; // post statement
        }
        return decimalNumber;
    }

    public Long convertDecimalToBinary(Long n) {
        long binaryNumber = 0L;
        long remainder;
        long i = 1L;
        long step = 1L;

        while (n != 0) {
            remainder = n % 2;
            System.out.println("Step " + step++ + ": " + n + " / 2");
            System.out.println("Quotient = " + n / 2 + ", Remainder = " + remainder);
            n /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
}
