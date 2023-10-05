package com.leetcode.ch1;

import java.util.*;

public class Sum3 {
  static int[] nums = {-1, 0, 1, 2, -1, -4};

  public static void main(String[] args) {
    Solution15 solution15 = new Solution15();
    System.out.println(solution15.threeSum(nums));
  }
}

class Solution15 {
  public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> res = new HashSet<>();
    if (nums.length == 0) return new ArrayList<>(res);
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
        else if (sum > 0) k--;
        else j++;
      }
    }
    return new ArrayList<>(res);
  }
}
