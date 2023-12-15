package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck518startEndSame {
    public static void main(String[] args) {
        System.out.println(startEndSame("Boolean ZeB"));
    }

    private static boolean startEndSame(String str) {
        return str.charAt(0) == str.charAt(str.length() - 1);
    }
}
