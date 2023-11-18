package com.zamannow.oop.data;

public record Range(int start, int end) {
    //  public Range {
    //    if (end <= start) {
    //      throw new IllegalArgumentException("End cannot be lesser than start");
    //    }
    //  }

    // compact constructor
    //  public Range {
    //     set negative start and end to 0
    //     by reassigning the compact constructor's
    //     implicit parameters
    //    if (start < 0) start = 0;
    //    if (end < 0) end = 0;
    //  }

    // canoncial constructor
    public Range(int start, int end) {
        if (end <= start) {
            throw new IllegalArgumentException("End cannot be lesser than start");
        }
        if (start < 0) {
            this.start = 0;
        } else {
            this.start = start;
        }
        if (end > 100) {
            this.end = 10;
        } else {
            this.end = end;
        }
    }
}
