package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck515isVowel {
    public static void main(String[] args) {
        System.out.println(isVowel("q"));
        System.out.println(isVowel("A"));
    }

    private static boolean isVowel(String vowel) {
        if (vowel.toLowerCase().equals("a")
                || vowel.toLowerCase().equals("e")
                || vowel.toLowerCase().equals("i")
                || vowel.toLowerCase().equals("o")
                || vowel.toLowerCase().equals("u")) {
            return true;
        } else {
            return false;
        }
    }
}
