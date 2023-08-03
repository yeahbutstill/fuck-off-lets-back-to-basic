package com.tij.initializationileanup;

public class MehodInit3 {
    //! int j = g(i); // illegal forward reference
    int i = f();

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
}
