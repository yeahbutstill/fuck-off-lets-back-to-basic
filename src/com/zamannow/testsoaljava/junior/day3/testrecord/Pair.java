package com.zamannow.testsoaljava.junior.day3.testrecord;

public record Pair<T>(T left, T right) {
    public static <U> Pair<U> of(U left, U right) {
        return new Pair<>(left, right);
    }
}
