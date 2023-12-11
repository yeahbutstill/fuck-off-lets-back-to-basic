package com.zamannow.testsoaljava.junior.day3.testrecord;

public record Point(int x, int y) {
    // canonical constructor
//    public Point(int x, int y) {
//        if (x == 0 && y == 0) {
//            throw new IllegalArgumentException(String.format("(%d, %d)", x, y));
//        }
//        this.x = x;
//        this.y = y;
//    }

    // compact constructor
    public Point {
        if (x == 0 && y == 0) {
            throw new IllegalArgumentException(String.format("(%d, %d)", x, y));
        }
    }

    public void print(Object o) {
        if (o instanceof Point(int x, int y)) {
            System.out.printf("o is point: %d/%d%n", x, y);
        } else if (o instanceof String s) {
            System.out.printf("o is a string: %s%n", s);
        } else {
            System.out.printf("o is something else: %s%n", o);
        }
    }
}
