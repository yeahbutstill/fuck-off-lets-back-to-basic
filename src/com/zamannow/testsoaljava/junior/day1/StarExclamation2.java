package com.zamannow.testsoaljava.junior.day1;

public class StarExclamation2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("*");
                }
            }
            System.out.print("!");
            System.out.println();
        }
    }
}
