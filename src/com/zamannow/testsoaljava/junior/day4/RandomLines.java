package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;

public class RandomLines {
    public static void main(String[] args) {
        randomLines();
    }

    private static void randomLines() {
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int startVal = random.nextInt(6) + 5;
        for (int a = 0; a < startVal; a++) {
            int rowVal = random.nextInt(81);
            for (int b = 0; b < rowVal; b++) {
                System.out.print(alphabet.charAt(random.nextInt(26)));
            }
            System.out.println();
        }
    }
}
