package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;

public class BJP3Exercise511threeHeads {
    public static void main(String[] args) {
        threeHeads();
    }

    private static void threeHeads() {
        Random r = new Random();
        int head = 0;
        while (head != 3) {
            Boolean random = r.nextBoolean();
            if (random == false) {
                System.out.print("H ");
                head++;
            } else {
                System.out.print("T ");
                head = 0;
            }
        }
        System.out.println();
        System.out.print("Three heads is a row");
    }
}
