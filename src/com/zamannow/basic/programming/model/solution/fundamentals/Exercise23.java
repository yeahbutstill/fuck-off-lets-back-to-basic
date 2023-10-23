package com.zamannow.basic.programming.model.solution.fundamentals;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Exercise23 {
  public static void main(String[] args) {
    String fileName = args[0];
    int[] whiteList = (new In(fileName)).readAllInts();
    char operation = args[1].charAt(0);

    if (operation != '-' && operation != '+') {
      throw new IllegalArgumentException("Operation need to be - or +");
    }

    boolean searchForWhileList = operation == '-';
    Arrays.sort(whiteList);

    while (!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      int index = binarySearch(key, whiteList);

      if (index != -1 && searchForWhileList) {
        StdOut.println("Number in whitelist: " + key);
      } else if (index == -1 && !searchForWhileList) {
        StdOut.println("Number not in whitelist: " + key);
      }
    }
  }

  public static int binarySearch(int key, int[] numbers) {
    return rank(key, numbers, 0, numbers.length - 1);
  }

  public static int rank(int key, int[] arr, int lo, int hi) {
    if (lo <= hi) {
      int mid = lo + (hi - lo) / 2;

      if (key < arr[mid]) {
        return rank(key, arr, lo, mid - 1);
      } else if (key > arr[mid]) {
        return rank(key, arr, mid + 1, hi);
      } else {
        return mid;
      }
    } else {
      return -1;
    }
  }
}
