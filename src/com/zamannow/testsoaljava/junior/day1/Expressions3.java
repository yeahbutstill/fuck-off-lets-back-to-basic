package com.zamannow.testsoaljava.junior.day1;

public class Expressions3 {
    public static void main(String[] args) {
        int a = 2 + 2 + 3 + 4;
        String b = "2 + 2 " + 3 + 4;
        String c = 2 + " 2 + 3 " + 4;
        String d = 3 + 4 + " 2 + 2";
        String e = "2 + 2 " + (3 + 4);
        String f = "(2 + 2) " + (3 + 4);
        String g = "hello 34 " + 2 * 4;
        String h = 2 + "(int) 2.0" + 2 * 2 + 2;
        String i = 4 + 1 + 9 + "." + (-3 + 10) + 11 / 3;
        String j = 8 + 6 * -2 + 4 + "0" + (2 + 5);
        String k = 1 + 1 + "8 - 2" + (8 - 2) + 1 + 1;
        String l = 5 + 2 + "(1 + 1)" + 4 + 2 * 3;
        String m = "1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9);

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
    }
}
