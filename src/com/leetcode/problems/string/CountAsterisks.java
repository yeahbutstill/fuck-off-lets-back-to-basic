package com.leetcode.problems.string;

public class CountAsterisks {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        String s1 = "iamprogrammer";
        String s2 = "yo|uar|e**|b|e***au|tifu|l";

        Solution2315 solution2315 = new Solution2315();
        System.out.println(solution2315.countAsterisks(s));
        System.out.println(solution2315.countAsterisks(s1));
        System.out.println(solution2315.countAsterisks(s2));
    }
}

class Solution2315 {
    public int countAsterisks(String s) {
        int res = 0, bars = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '*' && bars % 2 == 0) res++;
            if (s.charAt(i) == '|') bars++;
        }
        return res;
    }
}
