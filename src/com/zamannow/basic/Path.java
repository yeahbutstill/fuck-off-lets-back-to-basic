package com.zamannow.basic;

public record Path(Point from, Point to) {
    // nested record patterns
    public void print(Object o) {
        switch (o) {
            case Path(Point from, Point to) ->
                System.out.printf("o is a path: %d/%d -> %d/%d%n",
                        from.x(), from().y(), to.x(), to.y());
            default -> throw new IllegalStateException("Unexpected value: " + o);
        }
    }
}
