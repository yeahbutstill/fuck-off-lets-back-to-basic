package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise317padString {
    public static void main(String[] args) {
        System.out.println(padString("hello", 8));
        System.out.println(padString("congratulations", 10));
    }

    private static String padString(String s, int i) {
        String temp = "";
        int space = i - s.length();
        for (int a = 0; a < space; a++) {
            temp += " ";
        }
        return temp += s;
    }
}
