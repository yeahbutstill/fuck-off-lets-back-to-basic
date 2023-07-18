package com.leetcode.problems;

public class RestoreString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4,5,6,7,0,2,1,3};
        Solution1528 solution1528 = new Solution1528();
        System.out.println(solution1528.restoreString(s, indices));
    }
}

class Solution1528 {
    public String restoreString(String s, int[] indices) {
        int length = s.length();
        StringBuilder sb = new StringBuilder("");
        char[] c = new char[length];

        for(int i=0; i<length; i++){

            c[indices[i]] = s.charAt(i);

        }

        sb.append(c);

        return sb.toString();
    }
}