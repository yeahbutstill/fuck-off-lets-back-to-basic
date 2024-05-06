package com.zamannow.testsoaljava.junior.day3.testrecord;

import java.util.Objects;

/**
 * A Sealed Record Family
 */
public sealed interface SubSequence extends CharSequence permits Initial, Final, Middle {
    CharSequence seq();

    default int start() {
        return 0;
    }

    default int end() {
        return seq().length();
    }

    default char charAt(int index) {
        Objects.checkIndex(index, length());
        return seq().charAt(start() + index);
    }

    default int length() {
        return switch (this) {
            case Initial(var __, var end) -> end;
            case Final(var seq, var start) -> seq.length() - start();
            case Middle(var __, var start, var end) -> end - start;
        };
    }

    default CharSequence subSequence(int s, int e) {
        return switch (this) {
            case Initial(var seq, var end) when s == 0 -> new Initial(seq, e);
            case Final(var seq, var start) when start + e == seq.length() -> new Final(seq, start + s);
            default -> new Middle(seq(), start() + s, start() + e);
        };
    }
}
