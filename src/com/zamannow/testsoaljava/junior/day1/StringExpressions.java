package com.zamannow.testsoaljava.junior.day1;

import java.util.Locale;

public class StringExpressions {
    public static void main(String[] args) {
        // index       0123456789012345
        String str1 = "Frodo Baggins";
        String str2 = "Gandalf the GRAY";

        System.out.println(str1.length());
        System.out.println(str1.charAt(7));
        System.out.println(str2.charAt(0));
        System.out.println(str1.indexOf('o'));
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase().indexOf("B"));
        System.out.println(str1.substring(4));
        System.out.println(str2.substring(3, 14));
        System.out.println(str2.replace("a", "oo"));
        System.out.println(str2.replace("gray", "white"));
        System.out.println("str1".replace("r", "range"));
    }
}
