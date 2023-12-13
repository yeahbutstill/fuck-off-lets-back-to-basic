package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class BJP3Exercise410printGPA {
    public static void main(String[] args) {
        printGPA();
    }

    private static void printGPA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student record: ");
        String name = scanner.next();
        double scores = scanner.nextInt();
        double grade = 0;

        for (int a = 0; a < scores; a++) {
            grade += scanner.nextInt();
        }

        System.out.println(name + "'s grade is " + grade / scores);
    }
}
