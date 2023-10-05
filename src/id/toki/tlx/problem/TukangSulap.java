package id.toki.tlx.problem;

import java.util.Scanner;

public class TukangSulap {
  static int[][] line;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    int req;
    char row1;
    char row2;
    int rowA;
    int rowB;

    n = sc.nextInt();
    line = new int[2][n + 1];
    for (int i = 0; i < 2; i++) {
      for (int j = 1; j <= n; j++) {
        line[i][j] = sc.nextInt();
      }
    }

    req = sc.nextInt();
    for (int i = 0; i < req; i++) {
      row1 = sc.next().charAt(0);
      rowA = sc.nextInt();
      row2 = sc.next().charAt(0);
      rowB = sc.nextInt();
      swap(row1, rowA, row2, rowB);
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print(line[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void swap(char row1, int rowA, char row2, int rowB) {
    int temp = line[rowTrans(row1)][rowA];
    line[rowTrans(row1)][rowA] = line[rowTrans(row2)][rowB];
    line[rowTrans(row2)][rowB] = temp;
  }

  static int rowTrans(char row) {
    if (row == 'A') {
      return 0;
    } else {
      return 1;
    }
  }
}
