package com.zamannow.basic.programming.model.solution.fundamentals;

public class Exercise16 {
    public static void main(String[] args) {
        System.out.println(exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) return ", ";
        else return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
