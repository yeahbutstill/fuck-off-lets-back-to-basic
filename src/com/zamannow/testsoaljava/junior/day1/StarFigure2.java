package com.zamannow.testsoaljava.junior.day1;

public class StarFigure2 {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        // for row
        for (int rows = 0; rows < SIZE; rows++) {
            // for slash
            for (int forward = SIZE * 4 - 4; forward > rows * 4; forward--) {
                System.out.print("/");
            }

            for (int star = 0; star < rows * 8; star++) {
                System.out.print("*");
            }

            for (int back = SIZE * 4 - 4; back > rows * 4; back--) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
