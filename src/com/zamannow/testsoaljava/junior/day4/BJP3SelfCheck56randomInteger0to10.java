package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;

public class BJP3SelfCheck56randomInteger0to10 {
    public static void main(String[] args) {
        int a = 50;
        int b = 2;
        int c = 1;
        Random rand = new Random();
        int n = rand.nextInt(11); // max 10 tidak lebih atau sama dengan 11
        int y = rand.nextInt(a) * b + c;
        System.out.println(n);
        System.out.println(y);
    }
}
