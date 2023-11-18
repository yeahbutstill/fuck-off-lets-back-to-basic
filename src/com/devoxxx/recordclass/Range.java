package com.devoxxx.recordclass;

import java.util.Iterator;

public record Range(int begin, int end) implements Iterable<Integer> {
    public Range {
        if (end() < begin()) throw new IllegalStateException("End should be greater than begin");
    }

    public Range(int end) {
        this(0, end);
    }

    public static void main(String[] args) {
        var range = new Range(0, 5);
        System.out.println("range = " + range);
        System.out.println("begin = " + range.begin());

        for (var value : range) {
            System.out.println("values = " + value);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = begin();

            @Override
            public boolean hasNext() {
                return index < end;
            }

            @Override
            public Integer next() {
                return index++;
            }
        };
    }
}
