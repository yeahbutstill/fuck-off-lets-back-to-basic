package com.zamannow.testsoaljava.junior.day2;

import java.util.Scanner;

public class BJP3Exercise320inputBirthday {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
//            inputBirthday(input);
            processName(input);
        }
    }

    public static void inputBirthday(Scanner scanner) {
        System.out.print("On what day of the month were you born? ");
        int day = scanner.nextInt();
        System.out.print("What is the name of the month in which you were born? ");
        String mount = scanner.next();
        System.out.print("During what year were you born? ");
        int year = scanner.nextInt();
        System.out.print("You were born on " + mount + " " + day + ", " + year + ". " + "You're mighty old!");
    }

    public static void processName(Scanner scanner) {
        System.out.print("Please enter your full name: ");
        String first = scanner.next();
        String last = scanner.next();
        System.out.print("Your name in reverse order is " + last + ", " + first);
    }

    public static void reverseProcessName(Scanner scanner) {
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Your name in reverse order is ");
        printReverse(fullName);

    }

    private static void printReverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
