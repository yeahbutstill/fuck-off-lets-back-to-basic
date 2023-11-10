package com.zamannow.stdclass;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.println("ke " + i + ": nilai randomnya " + random.nextInt(1000));
        }
    }
}
