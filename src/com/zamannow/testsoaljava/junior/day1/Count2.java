package com.zamannow.testsoaljava.junior.day1;

public class Count2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.println("2 times " + i + " = " + 2 * i);
        }
        System.out.println("===================");

        for (int a = 1; a <= 6; a++) {
            System.out.println("15*count-11 " + a + " = " + (15 * a - 11));
        }
        System.out.println("====================");

        for (int b = 1; b <= 6; b++) {
            System.out.println("-10*count+40 " + b + " = " + (-10 * b + 40));
        }
        System.out.println("========================");


        for (int c = 1; c <= 6; c++) {
            System.out.println("4*count-11 " + c + " = " + (4 * c - 11));
        }
        System.out.println("==================================");

        for (int d = 1; d <= 6; d++) {

            System.out.println("-3*count+100 " + d + " = " + (-3 * d + 100));
        }
    }

}
