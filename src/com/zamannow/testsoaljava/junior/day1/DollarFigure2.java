package com.zamannow.testsoaljava.junior.day1;

public class DollarFigure2 {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        // for row
        for (int rows = 0; rows < SIZE; rows++) {
            // for stars
            for (int stars = 0; stars < rows * 2; stars++) {
                System.out.print("*");
            }

            // for dollar
            for (int dollar = SIZE; dollar > rows; dollar--) {
                System.out.print("$");
            }

            // for mid stars
            for (int midStars = SIZE * 2; midStars > rows * 2; midStars--) {
                System.out.print("*");
            }

            // for dollar
            for (int dollar = SIZE; dollar > rows; dollar--) {
                System.out.print("$");
            }

            // for stars
            for (int stars = 0; stars < rows * 2; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
