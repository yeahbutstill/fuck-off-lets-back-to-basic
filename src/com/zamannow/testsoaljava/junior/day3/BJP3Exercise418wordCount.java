package com.zamannow.testsoaljava.junior.day3;

import java.util.StringTokenizer;

public class BJP3Exercise418wordCount {
    public static void main(String[] args) {
        System.out.println(wordCount("hello"));
        System.out.println(wordCount("how are you"));
        System.out.println(wordCount(" this     string has     wide       spaces "));
    }

    private static int wordCount(String word) {
        StringTokenizer str = new StringTokenizer(word, " ");
        int count = 0;
        for (; str.hasMoreTokens(); str.nextToken()) {
            count++;
        }

        return count;
    }
}
