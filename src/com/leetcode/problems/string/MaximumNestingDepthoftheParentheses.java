package com.leetcode.problems.string;

public class MaximumNestingDepthoftheParentheses {
    private static String s = "(1+(2*3)+((8)/4))+1";
    private static Solution1614 solution1614 = new Solution1614();

    public static void main(String[] args) {
        System.out.println(solution1614.maxDepth(s));
    }
}

class Solution1614 {
    public int maxDepth(String s) {
        int res = 0, cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(')
                res = Math.max(res, ++cur);
            if (s.charAt(i) == ')')
                cur--;
        }
        return res;
    }
}
