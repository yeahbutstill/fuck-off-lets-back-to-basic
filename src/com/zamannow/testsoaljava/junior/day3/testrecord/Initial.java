package com.zamannow.testsoaljava.junior.day3.testrecord;

import java.util.Objects;

public record Initial(CharSequence seq, int end) implements SubSequence {
    public Initial {
        Objects.checkIndex(end, seq.length());
    }

    public String toString() {
        return seq.subSequence(0, end).toString();
    }
}
