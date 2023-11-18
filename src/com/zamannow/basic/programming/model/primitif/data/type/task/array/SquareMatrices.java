package com.zamannow.basic.programming.model.primitif.data.type.task.array;

public class SquareMatrices {
    public static void main(String[] args) {
        double[][] a = {{10, 20, 30, 40, 50}};
        int n = a.length;
        double[][] c = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { // Compute dot product of row i and column j.
                double[][] b = {{60, 70, 80, 90, 100}};
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                    System.out.println(c[i][j]);
                }
            }
        }
    }
}
