package com.leetcode.problems.string;

public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        String input = "egcfe";
        Solution2697 solution2697 = new Solution2697();
        System.out.println(solution2697.makeSmallestPalindrome(input));
    }
}

class Solution2697 {
    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(Character.toString(Math.min(s.charAt(i), s.charAt(n - i - 1))));
        return sb.toString();
    }
}
