package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class BJP3Exercise416printPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPalindrome(scanner);
    }

    private static void printPalindrome(Scanner scanner) {
        System.out.print("Type one or more words: ");
        String words = scanner.nextLine();
        int back = words.length() - 1;

        for (int front = 0; front < words.length(); front++) {
            Character c1 = words.charAt(front);
            Character c2 = words.charAt(back);

            if (c1.toString().compareToIgnoreCase(c2.toString()) != 0) {
                System.out.println(words + " is not a palindrome.");
                return;
            }
            back--;
        }
        System.out.println(words + " is a palindrome!");
    }
}
