package com.zamannow.testsoaljava.junior.day1;

public class Weird {
    public static void main(String[] args) {
        int number = 8;
        halfTheFun(11);
        halfTheFun(2 - 3 + 2 * 8);
        halfTheFun(number);
        System.out.println("number = " + number);
    }

    private static void halfTheFun(int number) {
        number = number / 2;
        for (int count = 1; count <= number; count++) {
            System.out.print(count + " ");
        }
        System.out.println();
    }
}
