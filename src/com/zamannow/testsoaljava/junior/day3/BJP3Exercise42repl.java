package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise42repl {
    public static void main(String[] args) {
        System.out.println(repl("hello", 3));
    }

    public static String repl(String s, int n) {
        String temp = "";
        for (int i = 1; i <= n; i++) {
            temp += s;
        }
        return temp;
    }

}
