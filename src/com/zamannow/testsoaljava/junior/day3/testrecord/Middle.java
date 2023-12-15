package com.zamannow.testsoaljava.junior.day3.testrecord;

import java.util.Objects;

public record Middle(CharSequence seq, int start, int end) implements SubSequence {
    public Middle {
        Objects.checkFromToIndex(start, end, seq.length());
    }

    public String toString() {
        return seq.subSequence(start, end).toString();
    }
}
