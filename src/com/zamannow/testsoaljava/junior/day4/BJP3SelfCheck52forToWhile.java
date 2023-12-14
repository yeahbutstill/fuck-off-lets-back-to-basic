package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck52forToWhile {
    public static void main(String[] args) {
        // a
        System.out.println("a.");
        int max = 5;
        int n = 1;
        while (n <= max) {
            System.out.println(n);
            n++;
        }
        System.out.println();

        // b
        System.out.println("b.");
        int total = 25;
        int number = 1;
        while (number <= (total / 2)) {
            total = total - number;
            System.out.println(total + " " + number);
            number++;
        }
        System.out.println();

        // c
        System.out.println("c.");
        int i = 1;
        while (i <= 2) {
            int j = 1;
            while (j <= 3) {
                int k = 1;
                while (k <= 4) {
                    System.out.print("*");
                    k++;
                }
                System.out.print("!");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();

        // d
        System.out.println("d.");
        int number1 = 4;
        int count = 1;
        while (count <= number1) {
            System.out.println(number1);
            number1 = number1 / 2;
            count++;
        }
    }
}
