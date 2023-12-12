package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class BJP3Exercise48smallestLargest {
    public static void main(String[] args) {
        smallestLargest();
    }

    public static void smallestLargest() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("How many numbers do you want to enter? ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        for (int i = 1; i <= answer; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();
            if (number < min) min = number;
            if (number > max) max = number;
        }

        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
    }
}
