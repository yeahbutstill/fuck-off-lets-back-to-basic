package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class CumulativeProduct {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            multiplying(console);
        }
    }

    private static void multiplying(Scanner scanner) {
        System.out.print("How many numbers? ");
        int cap = scanner.nextInt();
        int product = 1;

        for (int a = 0; a < cap; a++) {
            System.out.print("Next number --> ");
            product *= scanner.nextInt();
        }

        System.out.println("Product = " + product);
    }

}
