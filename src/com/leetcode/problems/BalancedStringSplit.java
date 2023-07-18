package com.leetcode.problems;

public class BalancedStringSplit {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        Solution1221 solution1221 = new Solution1221();
        System.out.println(solution1221.balancedStringSplit(s));
    }
}

class Solution1221 {
    public int balancedStringSplit(String s) {
        int res = 0, cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            cnt += s.charAt(i) == 'L' ? 1 : -1;
            if (cnt == 0) ++res;
        }
        return res;
    }
}
