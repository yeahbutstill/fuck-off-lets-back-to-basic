package com.zamannow.testsoaljava.junior.day4;

import java.util.Scanner;

public class BJP3SelfCheck59doWhileSeashore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "y";
        do {
            System.out.println("She sells seashells by the seashore.");
            System.out.print("Do you want to hear it again? ");
            answer = scanner.next();
        } while (answer.equals("y"));
    }
}
