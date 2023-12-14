package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise417swapPairs {
    public static void main(String[] args) {
        System.out.println(swapPairs("hello there"));
        System.out.println(swapPairs("example"));
        System.out.println(swapPairs("homework"));
        System.out.println(swapPairs("x"));
        System.out.println(swapPairs(""));
    }

    public static String swapPairs(String word) {
        String newString = "";

        for (int i = 0; i < word.length() / 2; i++) {
            newString += word.charAt(2 * i + 1);
            newString += word.charAt(2 * i);
        }

        if (word.length() % 2 != 0) {
            newString += word.charAt(word.length() - 1);
        }

        return newString;
    }
}
