package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise35PrintGrid {
    public static void main(String[] args) {
        printGrid(3, 6);
        System.out.println();
        printGrid(5, 3);
        System.out.println();
        printGrid(4, 1);
        System.out.println();
        printGrid(1, 3);
    }

    private static void printGrid(int rows, int columns) {
        for (int a = 1; a <= rows; a++) {
            int temp = a;
            for (int b = 1; b < columns; b++) {
                System.out.print(temp + ", ");
                temp += rows;
            }
            System.out.print(temp);
            System.out.println();
        }
    }
}
