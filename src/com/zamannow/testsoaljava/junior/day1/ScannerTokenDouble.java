package com.zamannow.testsoaljava.junior.day1;

import java.util.Scanner;

public class ScannerTokenDouble {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How much money do you have? ");
        double money = console.nextDouble();
        System.out.println(money);
    }
}
