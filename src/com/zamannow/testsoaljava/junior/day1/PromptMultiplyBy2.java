package com.zamannow.testsoaljava.junior.day1;

import java.util.Scanner;

public class PromptMultiplyBy2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type an integer: ");
        int i = console.nextInt();
        System.out.println(i + " times 2 = " + i * 2);
    }
}
