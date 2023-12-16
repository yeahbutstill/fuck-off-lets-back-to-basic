package com.zamannow.testsoaljava.junior.day4;

import java.util.Scanner;

public class BJP3SelfCheck526scannerAverage3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        for (int a = 0; a < 3; a++) {
            System.out.print("Type an integer: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Type an integer: ");
            }
            num += scanner.nextInt();
        }
        System.out.println("Average: " + num / 3);
    }
}
