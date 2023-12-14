package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;

public class BJP3SelfCheck57randomOddInteger50to99 {
    public static void main(String[] args) {
        int a = 25;
        int b = 2;
        int c = 51;
        Random rand = new Random();
        int y = rand.nextInt(a) * b + c;
        System.out.println(y);
    }
}
