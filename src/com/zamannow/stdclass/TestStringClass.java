package com.zamannow.stdclass;

public class TestStringClass {
    public static void main(String[] args) {
        String nama = "DnL yeahbutstill";
        System.out.println(nama.toLowerCase());
        System.out.println(nama.toUpperCase());
        System.out.println(nama.length());
        System.out.println(nama.startsWith("a"));
        System.out.println(nama.endsWith("l"));
        System.out.println("==================");

        String[] namesSplit = nama.split(" ");
        for (String value : namesSplit) {
            System.out.println(value);
        }
        System.out.println("======================");

        System.out.println("   ".isBlank());
        System.out.println("   ".isEmpty());
        System.out.println(nama.charAt(10));

        System.out.println("===================");
        char[] charArray = nama.toCharArray();
        for (char value : charArray) {
            System.out.println(value);
        }

        System.out.println("-------------------------------------");
        String str1 = "abc";
        System.out.println(str1);
        // setara dengan
        char[] data = {'a', 'b', 'c'};
        String str2 = new String(data);
        System.out.println(str2);

        // contoh lain menggunakan string
        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        System.out.println("====================");
        String c = "abc".substring(2, 3);
        String d = cde.substring(1, 2);
        System.out.println(c);
        System.out.println(d);
    }
}
