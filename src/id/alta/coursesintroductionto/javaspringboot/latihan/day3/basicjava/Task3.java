package id.alta.coursesintroductionto.javaspringboot.latihan.day3.basicjava;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        printDivisors(number);
    }

    static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
