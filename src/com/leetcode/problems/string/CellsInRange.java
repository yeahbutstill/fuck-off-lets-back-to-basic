package com.leetcode.problems.string;

import java.util.ArrayList;
import java.util.List;

public class CellsInRange {
  public static void main(String[] args) {
    String s = "K1:L2";
    Solution2194 solution2194 = new Solution2194();
    System.out.println(solution2194.cellsInRange(s));
  }
}

class Solution2194 {
  public List<String> cellsInRange(String s) {
    char c1 = s.charAt(0), c2 = s.charAt(3);
    char r1 = s.charAt(1), r2 = s.charAt(4);
    List<String> cells = new ArrayList<>();
    for (char c = c1; c <= c2; ++c) {
      for (char r = r1; r <= r2; ++r) {
        cells.add("" + c + r);
      }
    }
    return cells;
  }
}
