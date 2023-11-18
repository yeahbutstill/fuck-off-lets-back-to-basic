package com.leetcode.problems.string;

public class CountConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        Solution1684 solution1684 = new Solution1684();
        System.out.println(solution1684.countConsistentStrings(allowed, words));
    }
}

class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        int[] store = new int[26];

        for (char c : allowed.toCharArray()) {
            store[c - 'a']++;
        }

        for (String word : words) {

            for (char c : word.toCharArray()) {
                if (store[c - 'a'] <= 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
