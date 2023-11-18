package com.leetcode.problems.string;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    static int[] prices = {7, 1, 5, 3, 6, 4};

    public static void main(String[] args) {
        Solution121 solution121 = new Solution121();
        System.out.println(solution121.maxProfit(Arrays.stream(prices).toArray()));
    }
}

class Solution121 {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist;

        for (int price : prices) {
            if (price < lsf) {
                lsf = price;
            }
            pist = price - lsf;
            if (op < pist) {
                op = pist;
            }
        }
        return op;
    }
}
