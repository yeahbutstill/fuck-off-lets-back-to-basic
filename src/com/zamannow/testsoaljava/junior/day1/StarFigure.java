package com.zamannow.testsoaljava.junior.day1;

public class StarFigure {
    public static void main(String[] args) {
        // for row
        for (int rows = 0; rows < 5; rows++) {
            // for slash
            for (int forward = 16; forward > rows * 4; forward--) {
                System.out.print("/");
            }

            for (int star = 0; star < rows * 8; star++) {
                System.out.print("*");
            }

            for (int back = 16; back > rows * 4; back--) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
