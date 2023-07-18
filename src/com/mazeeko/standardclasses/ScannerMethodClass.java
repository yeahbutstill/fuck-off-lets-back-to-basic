package com.mazeeko.standardclasses;

import java.util.Scanner;

public class ScannerMethodClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");

        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Invalid integer, please enter an integer: ");
        }

        int i = input.nextInt();
    }
}
