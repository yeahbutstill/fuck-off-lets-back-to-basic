package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise419quadrant {
    public static void main(String[] args) {
        System.out.println(quadrant(12.4, 17.8));
    }

    private static int quadrant(double x, double y) {
        if (x == 0 || x == 3.14 || x == 1.57 || x == 4.71 ||
                y == 0 || y == 3.14 || y == 1.57 || y == 4.71) {
            return 0;
        }

        if (x > 0) {
            if (y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else { // (x < 0)
            if (y > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}
