package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise412printTriangleType {
    public static void main(String[] args) {
        printTriangleType(5, 7, 7);
    }

    private static void printTriangleType(int n1, int n2, int n3) {
        if (n1 == n2 && n1 == n3) System.out.println("equilateral");
        else if (n1 != n2 && n1 != n3 && n2 != n3) System.out.println("scalene");
        else if (n1 == n2 || n2 == n3 || n1 == n3) System.out.println("isosceles");
    }
}
