package com.zamannow.testsoaljava.junior.day3;

public class CapitalLetter {
    public static void main(String[] args) {
        String phrase = "aBCdd";
        if (Character.isUpperCase(phrase.charAt(0))) {
            System.out.println("capital");
        } else {
            System.out.println("not capital");
        }
    }
}
