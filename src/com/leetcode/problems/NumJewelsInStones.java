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
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (Character.isLowerCase(c)){
                arr[c - 'a']++;
            } else {
                arr2[c - 'A']++;
            }
        }

        for(int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            if (Character.isLowerCase(c)){
                if (arr[c - 'a'] != 0 ) res += arr[c - 'a'];
            } else {
                if (arr2[c - 'A'] != 0 ) res += arr2[c - 'A'];
            }
        }

        return res;
    }
}
