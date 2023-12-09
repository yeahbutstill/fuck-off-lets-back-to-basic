package com.zamannow.testsoaljava.junior.day3;

public class BJP3SelfCheck41logicalTests {
    public static void main(String[] args) {
        int z = 1;
        int y = 2;
        int x = 3;

        if (z % 2 == 1) System.out.println("z is odd");
        if (z <= Math.sqrt(y)) System.out.println("z is not greater than y's square root");
        if (y > 0) System.out.println("y is positive");
        if (x % 2 != y % 2) System.out.println("Either x or y is even, and the other is odd");
        if (y % z == 0) System.out.println("y is multiple of z");
        if (z != 0) System.out.println("z is not zero");
        if (Math.abs(y) > Math.abs(z)) System.out.println("y is greater in magnitude than z");
        if ((x >= 0) == (z < 0)) System.out.println("x and z are of opposite signs");
        if (y >= 0 && y < 10) System.out.println("y is nonnegative one-digit number");
        if (z >= 0) System.out.println("z is nonnegative");
        if (x % 2 == 0) System.out.println("x is even");
        if (Math.abs(x - y) < Math.abs(z - y)) System.out.println("x is closer in value to y than z is");
    }
}
