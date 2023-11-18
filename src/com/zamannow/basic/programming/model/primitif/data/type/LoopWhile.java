package com.zamannow.basic.programming.model.primitif.data.type;

public class LoopWhile {
    public static void main(String[] args) {
        int v = 0;
        while (v <= 10) {
            v = 2 * v;
            System.out.println(v);
            v++;
        }

        double c = 10.0;
        double t = c;
        while (Math.abs(t - c / t) > 1e-15 * t) {
            t = (c / t + t) / 2.0;
            System.out.println(t);
        }
    }
}
