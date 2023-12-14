package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck53whileLoopMystery1 {
    public static void main(String[] args) {
        mystery(1);
        mystery(6);
        mystery(19);
        mystery(39);
        mystery(74);
    }

    private static void mystery(int i) {
        int y = 1;
        int z = 0;
        while (2 * y <= i) {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }
}
