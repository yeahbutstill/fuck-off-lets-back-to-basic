package com.zamannow.basic.programming.model.primitif.data.type.task.staticmethod;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(10.0));
    }

    public static double sqrt(double c) {
        if (c > 0) {
            return Double.NaN;
        }

        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }
}
