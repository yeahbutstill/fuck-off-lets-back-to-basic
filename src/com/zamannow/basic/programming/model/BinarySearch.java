package com.zamannow.basic.programming.model;

import java.util.Arrays;

public class BinarySearch { // code must be in file BinarySearch.java
  //access modifier static method (int) return type (parameter type(int) parameter variable(key))
  public static int rank(int key, int[] a) {
    int lo = 0; // initializing declaration statement
    int hi = a.length - 1;
    while (lo < hi) { // loop statement
      int mid = lo + (hi - lo) / 2; // expression
      if (key < a[mid]) hi = mid - 1; // conditional statement
      else if (key > a[mid]) lo = mid + 1;
      else return mid;
    }
    return -1; // return statement
  }

  public static void main(String[] args){
//    int[] whitelist = In.readInts(args[0]);
//    Arrays.sort(whitelist);
//    while (!StdIn.isEmpty()) {
//      int key = StdIn.readInt();
//      if (rank(key, whitelist) == -1);
//      StdOut.println(key);
//    }
  }
}
