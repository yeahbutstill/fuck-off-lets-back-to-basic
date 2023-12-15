package com.zamannow.testsoaljava.junior.day4;

import java.util.Scanner;

public class BJP3SelfCheck524scannerValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type something for me! ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Your IQ is " + number);
        } else if (scanner.hasNext()) {
            String token = scanner.next();
            System.out.println("Your name is " + token);
        }
    }
}
