package com.zamannow.testsoaljava.junior.day4;

import java.util.Scanner;

public class BJP3SelfCheck525scannerYouTyped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        if (scanner.hasNextInt()) {
            int intNum = scanner.nextInt();
            System.out.println("You typed the integer " + intNum);
        } else if (scanner.hasNextDouble()) {
            double realNum = scanner.nextDouble();
            System.out.print("You typed the real number " + realNum);
        }
    }
}
