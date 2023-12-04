package com.zamannow.testsoaljava.junior.day1;

public class ValuesOfIJK {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = 4;
        int x = i + j + k;
        i = x - i - j;
        j = x - j - k;
        k = x - i - k;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("=======================");

        int max;
        int min = 10;
        max = 17 - 4 / 10;
        max = max + 6;
        min = max - min;
        System.out.println(max * 2);
        System.out.println(max + min);
        System.out.println(max);
        System.out.println(min);
    }
}
