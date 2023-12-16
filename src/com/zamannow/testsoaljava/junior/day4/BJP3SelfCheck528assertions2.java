package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;

public class BJP3SelfCheck528assertions2 {
    public static void main(String[] args) {
        System.out.println(mystery(10));
    }

    private static int mystery(int n) {
        Random r = new Random();
        int a = r.nextInt(3) + 1;
        int b = 2;
        // point A
        while (n > b) {
            // point B
            b = b + a;
            if (a > 1) {
                n--;
                // point C
                a = r.nextInt(b) + 1;
            } else {
                a = b + 1;
                // point D
            }
        }
        // point E
        return n;
    }
}
