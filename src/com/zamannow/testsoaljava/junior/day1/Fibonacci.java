package com.zamannow.testsoaljava.junior.day1;

public class Fibonacci {
    public static void main(String[] args) {
        int add = 0;
        int result = 1;
        for (int i = 1; i <= 12; i++) {
            System.out.print(result + " ");
            int temp = add + result;
            add = result;
            result = temp;
        }
    }
}
