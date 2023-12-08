package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise318vertical {
    public static void main(String[] args) {
        vertical("hey now");
    }

    private static void vertical(String s) {
        for (int size = 0; size < s.length(); size++) {
            System.out.println(s.charAt(size));
        }
    }
}
