package id.toki.tlx.problem;

import java.util.Scanner;

public class JawbreakerIKlik {
  int[][] inpt = new int[25][25];
  int count = 0;
  int m, n;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    JawbreakerIKlik jawbreakerIKlik = new JawbreakerIKlik();
    jawbreakerIKlik.m = sc.nextInt();
    jawbreakerIKlik.n = sc.nextInt();

    for (int i = 0; i < jawbreakerIKlik.m; i++) {
      for (int j = 0; j < jawbreakerIKlik.n; j++) {
        jawbreakerIKlik.inpt[i][j] = sc.nextInt();
      }
    }

    int b = sc.nextInt();
    int k = sc.nextInt();

    jawbreakerIKlik.floodFill(b, k, jawbreakerIKlik.inpt[b][k]);
    System.out.println(jawbreakerIKlik.count * (jawbreakerIKlik.count - 1));
  }

  void floodFill(int r, int c, int chNumber) {
    if (r >= 0 && r < m && c >= 0 && c < n && (inpt[r][c] == chNumber)) {
      count++;
      inpt[r][c] = 0;
      floodFill(r, c + 1, chNumber);
      floodFill(r + 1, c, chNumber);
      floodFill(r, c - 1, chNumber);
      floodFill(r - 1, c, chNumber);
    }
  }
}
