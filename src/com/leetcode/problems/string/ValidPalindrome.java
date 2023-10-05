package com.leetcode.problems.string;

public class ValidPalindrome {
  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    Solution125 solution125 = new Solution125();
    System.out.println(solution125.isPalindrome(s));
  }
}

class Solution125 {
  public boolean isPalindrome(String s) {
    if (s.isEmpty()) {
      return true;
    }
    int head = 0, tail = s.length() - 1;
    char cHead, cTail;
    while (head <= tail) {
      cHead = s.charAt(head);
      cTail = s.charAt(tail);
      if (!Character.isLetterOrDigit(cHead)) {
        head++;
      } else if (!Character.isLetterOrDigit(cTail)) {
        tail--;
      } else {
        if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
          return false;
        }
        head++;
        tail--;
      }
    }

    return true;
  }
}
