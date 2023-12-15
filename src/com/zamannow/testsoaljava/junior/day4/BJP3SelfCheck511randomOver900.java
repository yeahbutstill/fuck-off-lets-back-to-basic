package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;

public class BJP3SelfCheck511randomOver900 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 0;
        do {
            num = random.nextInt(1000);
            System.out.println("Random number: " + num);
        } while (num < 900);
    }
}
