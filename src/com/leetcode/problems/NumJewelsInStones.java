package com.leetcode.problems;

public class NumJewelsInStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        Solution771 solution771 = new Solution771();
        System.out.println(solution771.numJewelsInStones(jewels, stones));
    }
}

class Solution771 {
    public int numJewelsInStones(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }
}
