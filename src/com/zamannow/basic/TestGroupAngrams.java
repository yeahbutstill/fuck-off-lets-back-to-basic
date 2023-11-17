package com.zamannow.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGroupAngrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution49 solution = new Solution49();
        System.out.println(solution.groupAnagrams(strs));
    }
}

// O(m*n)
class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        // mapping charCount to list of Anagrams
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {

            // a ... z
            char[] ca = new char[26];
            for (char c : s.toCharArray()) {
                ca[c - 'a']++;
            }

            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }

            map.get(keyStr).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
