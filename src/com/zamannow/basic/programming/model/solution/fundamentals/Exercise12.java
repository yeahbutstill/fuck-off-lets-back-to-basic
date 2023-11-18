package com.zamannow.basic.programming.model.solution.fundamentals;

public class Exercise12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - 1;
            System.out.println(a[i]);
        }

        System.out.println("-----------------");

        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
            System.out.println(a[i]);
        }

        System.out.println("+++++++++++++++++++++");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
