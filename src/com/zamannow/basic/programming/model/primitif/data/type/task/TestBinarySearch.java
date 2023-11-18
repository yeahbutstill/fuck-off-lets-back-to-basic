package com.zamannow.basic.programming.model.primitif.data.type.task;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);

        while (!StdIn.isEmpty()) {
            // Read key, print if not in whitelist.
            int key = StdIn.readInt();
            if (rank(key, whiteList) < 0) StdOut.println(key);
        }
    }

    public static int rank(int key, int[] a) {
        // Array must be sorted
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
