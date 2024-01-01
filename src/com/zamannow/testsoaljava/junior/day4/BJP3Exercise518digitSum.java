package com.zamannow.testsoaljava.junior.day4;

import java.util.Random;
import java.util.Scanner;

public class BJP3Exercise518digitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(29107));
    }

    public static int digitSum(int num) {
        num = Math.abs(num);
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
