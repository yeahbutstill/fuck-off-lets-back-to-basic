package com.zamannow.testsoaljava.junior.day1;

public class ComputePay {
    public static void main(String[] args) {
        // Calculate pay at work based on hours worked each day
        int hours = 4+5+8+4;
        System.out.println("My total hours worked:");
        System.out.println(hours);

        double hSalary = 8.75;
        System.out.println("My hourly salary:");
        System.out.println("$"+ hSalary);

        double pay = hours * hSalary;
        System.out.println("My total pay:");
        System.out.println(pay);

        double tax = pay * 0.20;
        System.out.println("My taxes owed:"); // 20% tax
        System.out.println(tax);
    }
}
