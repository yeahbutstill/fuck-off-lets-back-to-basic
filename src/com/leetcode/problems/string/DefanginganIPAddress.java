package com.leetcode.problems.string;

public class DefanginganIPAddress {
    public static void main(String[] args) {
        String ip = "1.1.1.1";
        Solution1108 solution = new Solution1108();
        System.out.println(solution.defangIPaddr(ip));
    }
}

class Solution1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
