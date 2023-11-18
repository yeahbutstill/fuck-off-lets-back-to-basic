package com.leetcode.problems.string;

import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(
                List.of(
                        new String[]{
                                "phone", "blue", "pixel", "computer", "silver", "lenovo", "phone", "gold", "iphone"
                        }));
        String ruleKey = "color";
        String ruleValue = "silver";
        Solution1773 solution1773 = new Solution1773();
        System.out.println(solution1773.countMatches(items, ruleKey, ruleValue));
    }
}

class Solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;

        for (List<String> item : items) {
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) res++;
            if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) res++;
            if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) res++;
        }

        return res;
    }
}
