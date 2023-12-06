package com.zamannow.testsoaljava.junior.day1;

public class NestedNumbers {
    public static void main(String[] args) {
        // print all the different rows
        for (int a = 0; a < 3; a++) {
            // print numbers 1 sampai 9
            for (int b = 0; b <= 9; b++) {
                // print 3 of every single number
                for (int c = 0; c < 3; c++) {
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }
}
