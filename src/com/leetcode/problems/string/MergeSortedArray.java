package com.leetcode.problems.string;

import java.util.Arrays;

public class MergeSortedArray {
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    int m = 3;
    int n = 3;

    Solution88 solution88 = new Solution88();
    solution88.merge(nums1, m, nums2, n);
  }
}

class Solution88 {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int j = 0, i = m; j < n; j++) {
      nums1[i] = nums2[j];
      i++;
    }
    Arrays.sort(nums1);
  }
}
