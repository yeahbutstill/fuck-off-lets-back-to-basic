package com.zamannow.testsoaljava.junior.day3;

import java.util.LinkedList;
import java.util.Queue;

public class BJP3Exercise421perfectNumbers {
    public static void main(String[] args) {
        perfectNumbers(6);
    }

    private static void perfectNumbers(int max) {
        System.out.print("Perfect numbers up to " + max + ":");
        for (int a = 6; a <= max; a++) {
            Queue<Integer> number = new LinkedList<>();
            // checking number starting from 1 running until our current a / max perfect number
            for (int b = 1; b < a; b++) {
                if ((a % b) == 0) {
                    number.add(b); // adding in all proper factor
                }
            }

            int sum = 0;
            // for loop to sum all the proper factor
            for (int b : number) {
                sum += b;
            }

            if (a == sum) {
                System.out.print(" " + a);
            }
        }
    }
}
