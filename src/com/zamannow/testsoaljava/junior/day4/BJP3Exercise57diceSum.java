package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;
import java.util.Scanner;

public class BJP3Exercise57diceSum {
    public static void main(String[] args) {
        diceSum();
    }

    private static void diceSum() {
        System.out.print("Desired dice sum: ");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        Random random = new Random();
        int sumTemp = 0;
        do {
            int r1 = random.nextInt(6) + 1;
            int r2 = random.nextInt();
            System.out.println(r1 + " and " + r2 + " = " + sumTemp);
        } while (sum != sumTemp);
    }
}
