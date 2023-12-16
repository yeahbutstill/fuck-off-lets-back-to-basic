package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;

public class BJP3Exercise56makeGuesses {
    public static void main(String[] args) {
        makeGuesses();
    }

    private static void makeGuesses() {
        Random r = new Random();
        int random;
        int count = 0;
        do {
            random = r.nextInt(50) + 1;
            System.out.println("guess = " + random);
            count++;
        } while (random <= 48);
        System.out.println("total guesses = " + count);
    }
}
