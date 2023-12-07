package com.zamannow.testsoaljava.junior.day1;

import java.util.Scanner;

public class RobertPaulson {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your phrase? ");
        String s = console.nextLine();
        System.out.print("How many times should I repeat it? ");
        int i = console.nextInt();

        for (int u = 0; u < i; u++) {
            System.out.println(s);
        }
    }
}
