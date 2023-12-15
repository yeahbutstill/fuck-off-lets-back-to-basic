package com.zamannow.testsoaljava.junior.day4;

import java.util.Scanner;

public class BJP3SelfCheck513sentinelMinMax {
    public static void main(String[] args) {
        int sentinel = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number (or -1 to stop): ");
        int answer = scanner.nextInt();
        int max = answer;
        int min = answer;

        while (answer != -1) {
            if (answer > max) {
                max = answer;
            }
            if (answer < min) {
                min = answer;
            }
            System.out.print("Type a number (or -1 to stop): ");
            answer = scanner.nextInt();
        }

        if (min != sentinel) {
            System.out.println("Maximum was " + max);
            System.out.println("Minimum was " + min);
        }
    }
}
