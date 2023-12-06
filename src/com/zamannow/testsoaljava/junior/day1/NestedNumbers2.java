package com.zamannow.testsoaljava.junior.day1;

public class NestedNumbers2 {
    public static final int NUMBER_OF_ROWS = 5;
    public static void main(String[] args) {
        // print all the different rows
        for (int a = 0; a < NUMBER_OF_ROWS; a++){
            // print numbers 9 sampai 0
            for (int b = 9; b >= 0; b--) {
                // print 5 of every single number
                for (int c = 0; c < NUMBER_OF_ROWS; c++) {
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }
}
