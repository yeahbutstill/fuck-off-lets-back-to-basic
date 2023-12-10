package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class TestlastFirst {
    public static void main(String[] args) {
        System.out.println(lastFirst("Marla Singer"));
    }

    private static String lastFirst(String name) {
        try (Scanner scanner = new Scanner(name)) {
            char firstChar = scanner.next().charAt(0);
            String lastChar = scanner.next();

            return lastChar + ", " + firstChar + ".";
        }
    }
}
