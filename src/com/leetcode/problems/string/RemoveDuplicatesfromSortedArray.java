package com.leetcode.problems.string;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Solution26 solution26 = new Solution26();
        System.out.println(solution26.removeDuplicates(nums));
    }
}
class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}