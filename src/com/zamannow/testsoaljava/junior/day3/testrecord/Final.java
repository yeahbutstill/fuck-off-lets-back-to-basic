package com.zamannow.testsoaljava.junior.day3.testrecord;

import java.util.Objects;

public record Final(CharSequence seq, int start) implements SubSequence {
    public Final {
        Objects.checkIndex(start, seq.length());
    }

    public String toString() {
        return seq.subSequence(start, seq.length()).toString();
    }
}
