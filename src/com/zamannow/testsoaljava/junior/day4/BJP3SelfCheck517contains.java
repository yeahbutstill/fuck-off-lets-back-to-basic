package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck517contains {
    public static void main(String[] args) {
        System.out.println(contains("String", 't'));
    }

    private static boolean contains(String str, char ch) {
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                found = true;
            }
        }
        return found;
    }
}
