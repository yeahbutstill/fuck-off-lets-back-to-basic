package com.zamannow.testsoaljava.junior.day1;

public class DollarFigure {
    public static void main(String[] args) {
        // for row
        for (int rows = 0; rows < 7; rows++) {
            // for stars
            for (int stars = 0; stars < rows * 2; stars++) {
                System.out.print("*");
            }

            // for dollar
            for (int dollar = 7; dollar > rows; dollar--) {
                System.out.print("$");
            }

            // for mid stars
            for (int midStars = 14; midStars > rows * 2; midStars--) {
                System.out.print("*");
            }

            // for dollar
            for (int dollar = 7; dollar > rows; dollar--) {
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
