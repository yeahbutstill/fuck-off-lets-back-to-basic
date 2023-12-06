package com.zamannow.testsoaljava.junior.day1;

public class NestedNumbers3 {
    public static void main(String[] args) {
        // print all the different rows
        for (int a = 0; a < 4; a++){
            // print number 9 sampai 0
            for (int b = 9; b > 0; b--) {
                // print c nilainya dari perulangan b sampai 0
                for (int c = b; c > 0; c--) {
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }
}
