package com.zamannow.testsoaljava.junior.day3;

public class BJP3SelfCheck424secondHalfLetters {
    public static void main(String[] args) {
        System.out.println(secondHalfLetters("ruminates"));
        System.out.println(secondHalfLetters("dnl"));
    }

    private static Integer secondHalfLetters(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) >= 'n') {
                count++;
            }
        }
        return count;
    }
}
