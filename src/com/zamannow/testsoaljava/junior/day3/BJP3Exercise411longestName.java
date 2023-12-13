package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class BJP3Exercise411longestName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        longestName(scanner, 5);
    }

    public static void longestName(Scanner scanner, int n) {
        String longest = "";
        boolean tie = false;

        for (int a = 1; a <= n; a++) {
            System.out.print("name #" + a + "? ");
            String current = scanner.next();
            if (current.length() == longest.length()) tie = true;
            if (current.length() > longest.length()) {
                tie = false;
                longest = current;
            }
        }

        String all = longest.substring(0, 1).toUpperCase() + longest.substring(1).toLowerCase();
        System.out.println(all + "'s name is longest");
        if (tie == true) {
            System.out.println("(There was a tie!)");
        }
    }
}
