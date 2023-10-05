package id.toki.tlx.problem;

import java.util.Scanner;

public class PerkalianMatriks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int p = sc.nextInt();

    int[][] array1 = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        array1[i][j] = sc.nextInt();
      }
    }

    int[][] array2 = new int[m][p];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < p; j++) {
        array2[i][j] = sc.nextInt();
      }
    }

    int[][] ans = new int[n][p];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < p; j++) {
        for (int k = 0; k < m; k++) {
          ans[i][j] += array1[i][k] * array2[k][j];
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < p; j++) {
        System.out.print(ans[i][j] + " ");
      }
      System.out.println();
    }
  }
}
