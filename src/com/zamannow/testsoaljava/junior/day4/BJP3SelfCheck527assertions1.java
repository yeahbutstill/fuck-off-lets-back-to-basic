package com.zamannow.testsoaljava.junior.day4;

import java.util.Scanner;

public class BJP3SelfCheck527assertions1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        System.out.println(mystery(scanner, 10));
    }

    private static int mystery(Scanner scanner, int x) {
        int y = scanner.nextInt();
        int count = 10;
        // point A
        while (y < x) {
            System.out.print("Masukan angka: ");
            // point B
            if (y == 0) {
                count++;
                // point C
            }
            y = scanner.nextInt();
            // point D
        }
        // point E
        return count;
    }
}
