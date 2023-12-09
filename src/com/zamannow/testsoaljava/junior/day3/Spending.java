package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class Spending {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        spending(console, "Dnl");
    }

    public static void spending(Scanner console, String name) {
        System.out.print("How much will " + name + " be spending? ");
        double amount = console.nextDouble();
        System.out.println();

        int numBils1 = (int) (amount / 20.0);
        if (numBils1 * 20.0 < amount) {
            numBils1++;
        }
        System.out.println(name + " needs " + numBils1 + " bills");
    }
}
