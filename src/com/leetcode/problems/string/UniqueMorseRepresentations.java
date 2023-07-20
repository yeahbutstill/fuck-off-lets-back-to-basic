package com.leetcode.problems.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
    public static void main(String[] args) {
        String[] word = {"jangan", "kasih", "tau", "orang", "lain"};
        Solution804 solution804 = new Solution804();
        System.out.println(solution804.uniqueMorseRepresentations(word));
    }
}

class Solution804 {
    private final String[] morseCodes = {
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        final Set<String> codes = new HashSet<>();

        for (String word : words) {
            final StringBuilder morseCode = new StringBuilder();
            for (int i = 0, n = word.length(); i < n; i++) {
                morseCode.append(morseCodes[word.charAt(i) - 'a']);
            }
            codes.add(morseCode.toString());
        }

        return codes.size();
    }
}
