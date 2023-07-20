package com.leetcode.ch1;

public class PolindromeNumber {
    static int x = 121;
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.isPalindrome(x));
    }
}

class Solution9 {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}