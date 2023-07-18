package com.leetcode.problems.string;

public class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        Solution1662 solution1662 = new Solution1662();
        System.out.println(solution1662.arrayStringsAreEqual(word1, word2));
    }
}

class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2)
    {
        return(String.join("", word1).equals(String.join("", word2)));
    }
}