package com.zamannow.generic.genericmethod;

public class ArrayHelper {
    public static <T> int staticCount(T[] array) {
        return array.length;
    }

    public <T> int count(T[] array) {
        return array.length;
    }
}

