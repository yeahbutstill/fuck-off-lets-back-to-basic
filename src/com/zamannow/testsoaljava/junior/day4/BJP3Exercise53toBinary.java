package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise53toBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(42));
        System.out.println(42/2);
        System.out.println(21/2);
        System.out.println(10/2);
        System.out.println(5/2);
        System.out.println(2/2);
        System.out.println(1/2);
    }

    private static String toBinary(int i) {
        String result = "";
        result = i % 2 + result;
        i /= 2;
        while (i != 0) {
            result = i % 2 + result;
            i /= 2;
        }
        return result;
    }
}
