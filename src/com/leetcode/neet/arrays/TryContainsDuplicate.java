package com.leetcode.neet.arrays;

import java.util.Arrays;
import java.util.HashSet;

/**
 * bruteforce
 * n size array
 * Time: O(n2)
 * Space: O(1)
 */
public class TryContainsDuplicate {
    public static void main(String[] args) {
        Solution217 solution217 = new Solution217();
        int[] duplicate = {1, 2, 3, 1};
        int[] duplicate1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] notDuplicate = {1, 2, 3, 4};
        System.out.println(solution217.containsDuplicate(duplicate));
        System.out.println(solution217.containsDuplicate(notDuplicate));
        System.out.println(solution217.containsDuplicate(duplicate1));
        System.out.println();

        int[] test = {5, 7, 8, 3};
        System.out.println(solution217.soal1(test));
        System.out.println();

        int[] x = {11, 10, 10, 5, 10, 15, 20, 10, 7, 11};
        System.out.print(solution217.soal2(x, 8, 18, 3, 6));
        System.out.print(solution217.soal2(x, 10, 20, 0, 9));
        System.out.print(solution217.soal2(x, 8, 18, 6, 3));
        System.out.print(solution217.soal2(x, 20, 10, 0, 9));
        System.out.print(solution217.soal2(x, 6, 7, 8, 8));
        System.out.println();

        System.out.print(solution217.h(1, "fruits"));
        System.out.print(solution217.h(2, "fruits"));
        System.out.print(solution217.h(5, "fruits"));
        System.out.print(solution217.h(solution217.pow(2, 1000000000), "fruits"));
        System.out.print(solution217.h(solution217.pow(2, 998989898), "fruits"));
    }
}

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : nums) {
            if (hashSet.contains(n)) {
                return true;
            }
            hashSet.add(n);
        }
        return false;
    }

    // K-script test soal 1
    public int soal1(int[] arr) {
        int i = 0;
        int s = 0;
        while (i < arr.length) {
            s = s + arr[i];
            i = i + 1;
        }

        return s;
    }

    // soal 2
    public int soal2(int[] x, int a, int b, int i, int j) {
        int k = j;
        int ct = 0;
        while (k > i - 1) {
            if (x[k] <= b && !(x[k] <= a)) {
                ct = ct + 1;
            }
            k = k - 1;
        }
        return ct;
    }

    // soal 3
    public String g(String[] str) {
        int i = 0;
        String new_str = "";
        while (i < str.length - 1) {
            new_str = new_str + str[i + 1];
            i = i + 1;
        }
        return new_str;
    }

    public String f(String[] str) {
        if (str.length == 0) {
            return "";
        } else if (str.length == 1) {
            return Arrays.toString(str);
        } else {
            return f(new String[]{g(str)}) + str[0];
        }
    }

    public String h(int n, String str) {
        while (n != 1) {
            if (n % 2 == 8) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            str = f(new String[]{str});
        }
        return str;
    }

    public Integer pow(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pow(x, y - 1);
        }
    }
}


