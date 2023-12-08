package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise313pay {
    public static void main(String[] args) {
        System.out.println(pay(5.50, 6));
        System.out.println(pay(4.00, 11));
    }

    private static double pay(double salary, int hours) {
        if (hours > 8) return (salary * 8) + (salary * 3 / 2 * (hours - 8));
        else return salary * hours;
    }
}
