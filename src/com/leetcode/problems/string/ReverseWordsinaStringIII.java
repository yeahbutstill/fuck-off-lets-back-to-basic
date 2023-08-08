package com.leetcode.problems.string;

public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        Solution557 solution557 = new Solution557();
        System.out.println(solution557.reverseWords(s));
    }
}

class Solution557 {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder res =new StringBuilder();

        for(int i = 0;i<strings.length;i++){
            StringBuilder sb = new StringBuilder(strings[i]);
            res.append(sb.reverse()+ " ");
        }
        return String.valueOf(res).stripTrailing();
    }
}
