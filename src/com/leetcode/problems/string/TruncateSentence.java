package com.leetcode.problems.string;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        Integer k = 4;
        Solution1816 solution1816 = new Solution1816();
        System.out.println(solution1816.truncateSentence(s, k));

    }
}

class Solution1816 {
    public String truncateSentence(String s, int k) {
        int idx=0;
        int spaceCount=0;

        while(idx < s.length() && spaceCount < k){
            if(s.charAt(idx) == ' ') spaceCount++;
            idx++;
        }
        // if(spaceCount<k) means we have to include whole string
        return spaceCount == k ? s.substring(0, idx - 1) : s;
    }
}

