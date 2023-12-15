package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck520whileLoopMystery3 {
    public static void main(String[] args) {
        System.out.println(mystery(3, 3));
        System.out.println(mystery(5, 3));
        System.out.println(mystery(2, 6));
        System.out.println(mystery(12, 18));
        System.out.println(mystery(30, 75));
    }

    private static int mystery(int x, int y) {
        while (x != 0 && y != 0) {
            if (x < y) {
                y = y - x;
            } else {
                x = x - y;
            }
        }
        return x + y;
    }
}
