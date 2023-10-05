package com.leetcode.problems.string;

public class CheckIfPangram {
  public static void main(String[] args) {
    String sentence = "thequickbrownfoxjumpsoverthelazydog";
    Solution1832 solution1832 = new Solution1832();
    System.out.println(solution1832.checkIfPangram(sentence));
  }
}

class Solution1832 {
  public boolean checkIfPangram(String sentence) {
    boolean[] letters = new boolean[26];
    for (char c : sentence.toCharArray()) {
      letters[c - 'a'] = true;
    }

    // find any letters that not exist
    for (boolean existsLetter : letters) {
      if (!existsLetter) return false;
    }

    return true;
  }
}
