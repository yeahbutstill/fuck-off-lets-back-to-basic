package com.leetcode.ch1;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        Solution217a solution217a = new Solution217a();
        Solution217b solution217b = new Solution217b();
        System.out.println(solution217a.containsDuplicate(nums));
        System.out.println(solution217b.containsDuplicate(nums));
    }
}

// Time complexity: O(n)
// Space complexity: O(n)
class Solution217a {
    public boolean containsDuplicate(int[] nums) {
        // Create a hashset...
        HashSet<Integer> hset = new HashSet<>();
        // Traverse all the elements through the loop...
        for (int num : nums) {
            // Searches hashset. if present, it contains duplicate...
            if (hset.contains(num)) {
                return true;
            }
            // if not present it will update hashset...
            hset.add(num);
        }
        // Otherwise return false...
        return false;
    }
}

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------
// Time complexity: O(n)
// Space complexity: O(n)
class Solution217b {
    public boolean containsDuplicate(int[] nums) {
        // Base case...
        if (nums == null || nums.length == 0) return false;
        // Create a hashset...
        HashSet<Integer> hset = new HashSet<>();
        // Traverse all the elements through the loop...
        for (int idx : nums) {
            // If it contains duplicate...
            if (!hset.add(idx)) {
                return true;
            }
        }
        // Otherwise return false...
        return false;
    }
}
