package com.zamannow.testsoaljava.junior.day1;

public class SlashFigure2 {
    public static final int height = 7;

    public static void main(String[] args) {
        int temp = 0;
        // for row
        for (int a = 0; a < height; a++) {
            // for backslash (\)
            for (int b = 0; b < a * 2; b++) {
                System.out.print("\\");
            }

            // for tanda seru (!)
            for (int c = height * 4 - 2; c > temp; c--) {
                System.out.print("!");
            }
            temp += 4;

            // for slash (/)
            for (int d = 0; d < a * 2; d++) {
                System.out.print("/");
            }

            System.out.println();
        }
    }
}
