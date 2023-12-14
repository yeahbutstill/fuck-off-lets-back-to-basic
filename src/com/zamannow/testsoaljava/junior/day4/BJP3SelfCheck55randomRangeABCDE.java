package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;

public class BJP3SelfCheck55randomRangeABCDE {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(20) + 50;
        int c = rand.nextInt(20 + 50);
        int d = rand.nextInt(100) - 2;
        int e = rand.nextInt(10) * 4;

        System.out.println(a); // 0 - 99
        System.out.println(b); // 50 - 69
        System.out.println(c); // 0 - 69
        System.out.println(d); // -20 - 79
        System.out.println(e); // 0, 4, 8, 12, 16, 20, 24, 28, 32, 36
    }
}
