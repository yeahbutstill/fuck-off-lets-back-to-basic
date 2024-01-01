package com.zamannow.testsoaljava.junior.day4;

import java.util.Scanner;

public class BJP3Exercise512printAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printAverage(console);
    }

    private static void printAverage(Scanner input) {
        int count = 0;
        int answer = 0;
        double average = 0;

        while (answer >= 0) {
            System.out.print("Type a number: ");
            answer = input.nextInt();
            if (answer >= 0) {
                average += answer;
                count++;
            } else if (count != 0) {
                average = average / count;
            }
        }

        if (count != 0) {
            System.out.println("Average was " + average);
        }
    }
}
