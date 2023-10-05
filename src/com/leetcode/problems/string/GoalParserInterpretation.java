package com.leetcode.problems.string;

public class GoalParserInterpretation {
  public static void main(String[] args) {
    String command = "G()(al)";
    Solution1678 solution1678 = new Solution1678();
    System.out.println(solution1678.interpret(command));
  }
}

class Solution1678 {
  public String interpret(String command) {
    StringBuilder S = new StringBuilder(command.length());
    for (int i = 0; i < command.length(); i++) {
      if (command.charAt(i) == 'G') S.append('G');
      if (command.charAt(i) == '(') {
        if (command.charAt(i + 1) == ')') {
          S.append('o');
          i++;
        } else {
          S.append("al");
          i = i + 3;
        }
      }
    }
    return S.toString();
  }
}
