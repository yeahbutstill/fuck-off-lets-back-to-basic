package com.leetcode.problems;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = new String[]{"--X","X++","X++"};
        Solution2011 solution2011 = new Solution2011();
        System.out.println(solution2011.finalValueAfterOperations(operations));
    }
}

/**
 * In any case (suffix or prefix), any operation will have its main operation "identifier" (plus or minus) in the middle.
 * Since every character has an equivalent integer value, and related characters have close int values, we can use it.
 * The plus character (+) is equal to 43, and the minus character (-) is equal to 45. Therefore, x += 44 - middle operation character;
 * if it's plus, it will be x += 44 - 43 (1); if it's minus, it will be x += 44 - 45 (-1)
 */
class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String o : operations) x += (44 - o.charAt(1));
        return x;
    }
}
