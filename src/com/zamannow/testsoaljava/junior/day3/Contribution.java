package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class Contribution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Is your money multiplied 1 or 2 times? ");
        int times = console.nextInt();
        int sum = 0;
        int count1 = 0;
        int count2 = 0;
        int total = 0;
        System.out.print("And how much are you contributing? ");
        int donation = console.nextInt();

        if (times == 1) {
            sum += donation;
            count1++;
        } else if (times == 2) {
            sum += 2 * donation;
            count2++;
        }
        total = total + donation;
        System.out.println("count1: " + count1);
        System.out.println("count2: " + count2);
        System.out.println("sum: " + sum);
        System.out.println("total: " + total);
    }
}
