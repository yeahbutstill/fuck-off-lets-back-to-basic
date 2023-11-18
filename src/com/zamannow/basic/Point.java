package com.zamannow.basic;

public record Point(int x, int y) {
    // canonical constructor
    public Point(int x, int y) {
        if (x == 0 && y == 0) throw new IllegalArgumentException(String.format(("%d, %d"), x, y));
        this.x = x;
        this.y = y;
    }

    // compact constructor
  /*public PointOldFinal(int x, int y) {
      if (x == 0 && y == 0) throw new IllegalArgumentException(String.format(("%d, %d"), x, y));
  }*/

    // record pattern and pattern matching fo instanceof
    public void printPatternInstanceof(Object o) {
        if (o instanceof Point(int x, int y)) System.out.printf("o is a point: %d/%d%n", x, y);
        else if (o instanceof String s) System.out.printf("o is a String %s%n", s);
        else System.out.printf("o is something else: %s%n", o);
    }

    // record pattern and pattern matching for switch
    public void printPatternSwitch(Object o) {
        switch (o) {
            case Point(int x, int y) -> System.out.printf("o is a point: %d/%d%n", x, y);
            case String s -> System.out.printf("o is a String %s%n", s);
            default -> System.out.printf("o is something else: %s%n", o);
        }
    }

}
