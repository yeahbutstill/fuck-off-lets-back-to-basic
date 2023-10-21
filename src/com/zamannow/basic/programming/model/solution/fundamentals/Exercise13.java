package com.zamannow.basic.programming.model.solution.fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Exercise13 {
  public static void main(String[] args) {
    int[][] mat = {
      {1, 2, 3},
      {4, 5, 6}
    };

    System.out.println("lebar array " + mat[0].length);
    System.out.println("panjang array " + mat.length + "\n");

    transpose(mat);
    StdOut.println("\nExpected");
    StdOut.println("1 4 \n" + "2 5 \n" + "3 6");
  }

  public static void transpose(int[][] mat) {
    int[][] newMat = new int[mat[0].length][mat.length];
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        newMat[j][i] = mat[i][j];
      }
    }
    print(newMat);
  }

  public static void print(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        StdOut.print(mat[i][j] + " ");
      }
      StdOut.println();
    }
  }
}
