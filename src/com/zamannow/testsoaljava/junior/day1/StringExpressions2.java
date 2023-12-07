package com.zamannow.testsoaljava.junior.day1;

public class StringExpressions2 {
    public static void main(String[] args) {
        String str1 = "Q.E.D.";
        String str2 = "Arcturan Megadonkey";
        String str3 = "Sirius Cybernetics Corporation";

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str1.substring(2, 4));
        System.out.println(str2.substring(10, 14));
        System.out.println(str1.indexOf("D"));
        System.out.println(str1.indexOf("."));
        System.out.println(str2.indexOf("donkey"));
        System.out.println(str3.indexOf("X"));
        System.out.println("==============================");
        System.out.println(str2 + "..." + str3.charAt(17));
        System.out.println("-------------------------------");
        System.out.println(str3.substring(9, str3.indexOf("e")));
        System.out.println("+===================================+");
        System.out.println(str3.indexOf("e"));
        System.out.println(str3.substring(7, 12));
        System.out.println(str2.toLowerCase().substring(9, 13) + str3.substring(18, str3.length() - 7));
    }
}
