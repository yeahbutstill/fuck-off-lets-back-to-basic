package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class BJP3Exercise49evenSumMax {
    public static void main(String[] args) {
        evenSum();
    }

    public static void evenSum() {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        System.out.print("how many integers? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int a = 0; a < size; a++) {
            System.out.print("next integer? ");
            int current = scanner.nextInt();
            if (current % 2 == 0) {
                sum += current;
                if (current > max) {
                    max = current;
                }
            }
        }

        System.out.println("even sum = " + sum);
        System.out.println("even max = " + max);
    }
}
