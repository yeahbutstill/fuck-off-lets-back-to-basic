package com.leetcode.problems.string;

public class MostWordsFound {
    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        Solution2114 solution2114 = new Solution2114();
        System.out.println(solution2114.mostWordsFound(sentences));
    }
}

class Solution2114 {
    public int mostWordsFound(String[] sentences) {
        int maxLen = 0;

        for (String currSent : sentences) {
            int currLen = currSent.split(" ").length;
            if (maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen;
    }
}
