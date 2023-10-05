package com.leetcode.ch1;

import java.util.Scanner;

/**
 * R-1.3 Tulis metode pendek Java, isMultiple, yang membutuhkan dua nilai panjang, n dan m, dan
 * mengembalikan true jika dan hanya jika n adalah kelipatan dari m, yaitu n = mi untuk bilangan
 * bulat i.
 */
public class IsMultipleDemo {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("Please input two numbers for n and m: ");
    long n = stdIn.nextLong();
    long m = stdIn.nextLong();
    System.out.println(isMultiple(n, m));
  }

  private static boolean isMultiple(long n, long m) {
    if (m > n) return isMultiple(m, n);
    return (n & m) == 0;
  }
}
