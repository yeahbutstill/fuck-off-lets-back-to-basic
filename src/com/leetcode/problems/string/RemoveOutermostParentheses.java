package com.leetcode.problems.string;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())", s1 = "(()())(())(()(()))", s2 = "()()";
        Solution1021 solution1021 = new Solution1021();
        System.out.println(solution1021.removeOuterParentheses(s));
    }
}

class Solution1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }
}