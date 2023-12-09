package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int i = scanner.nextInt();
        if (i % 2 == 0) System.out.println("even");
        if (i % 2 != 0) System.out.println("odd");
    }
}
