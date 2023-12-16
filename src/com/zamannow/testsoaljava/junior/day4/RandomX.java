package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;

public class RandomX {
    public static void main(String[] args) {
        randomX();
    }

    private static void randomX() {
        Random random = new Random();
        int x = random.nextInt(15) + 5;
        while (x < 16) {
            for (int i = 0; i < x; i++) {
                System.out.print("x");
            }
            System.out.println();
            x = random.nextInt(15) + 5;
        }

        for (int h = 0; h < x; h++) {
            System.out.print("x");
        }
        System.out.println();
    }

}
