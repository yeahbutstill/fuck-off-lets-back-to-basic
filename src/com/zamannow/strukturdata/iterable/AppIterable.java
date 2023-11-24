package com.zamannow.strukturdata.iterable;

import java.util.List;

public class AppIterable {
    public static void main(String[] args) {
        //
        Iterable<String> names = List.of("GOJO", "SHIJI", "SHABUMI");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
