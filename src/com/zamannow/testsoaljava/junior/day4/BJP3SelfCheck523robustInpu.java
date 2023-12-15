package com.zamannow.testsoaljava.junior.day4;

import java.util.Scanner;

public class BJP3SelfCheck523robustInpu {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your age: ");
        while (!console.hasNextInt()) {
            console.next();
            System.out.print("Type your age: ");
        }
        int age = console.nextInt();

        System.out.print("Type your GPA: ");
        while (!console.hasNextDouble()) {
            console.next();
            System.out.print("Type your GPA: ");
        }
        double gpa = console.nextDouble();
        System.out.println("age = " + age + ", GPA = " + gpa);
    }
}
