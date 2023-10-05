package com.leetcode.ch1;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
  static String s = "abcabcbb";

  public static void main(String[] args) {
    Solution3 solution3 = new Solution3();
    System.out.println(solution3.lengthOfLongestSubstring(s));
  }
}

class Solution3 {
  public int lengthOfLongestSubstring(String s) {
    int i = 0;
    int j = 0;
    int max = 0;
    Set<Character> set = new HashSet<>();

    while (j < s.length()) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        max = Math.max(max, set.size());
      } else {
        set.remove(s.charAt(i++));
      }
    }

    return max;
  }
}
