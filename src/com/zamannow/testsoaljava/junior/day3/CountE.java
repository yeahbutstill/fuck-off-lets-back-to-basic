package com.zamannow.testsoaljava.junior.day3;

public class CountE {
    public static void main(String[] args) {
        int count = 0;
        String s = "EdnldEnldnlE";
        for (int i = 0; i < s.length(); i++) {
//            if (s.toLowerCase().charAt(i) == 'e') {
//                count++;
//            }

            if (Character.toLowerCase(s.charAt(i)) == 'e') {
                count++;
            }
        }
        System.out.println(count);
    }
}
