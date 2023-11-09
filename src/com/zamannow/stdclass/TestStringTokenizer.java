package com.zamannow.stdclass;

import java.util.StringTokenizer;

public class TestStringTokenizer {
    public static void main(String[] args) {
        String name = "Hanabi Naruto Aja Nih";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
