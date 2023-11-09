package com.zamannow.stdclass;

import java.util.StringJoiner;

public class TestStringJoin {
    public static void main(String[] args) {
        String[] names = {"Nana", "Almon", "Fany"};
        StringJoiner joiner = new StringJoiner("👽", "[", "]");
        for (String name : names) {
            joiner.add(name);
        }
        System.out.println(joiner);
    }
}
