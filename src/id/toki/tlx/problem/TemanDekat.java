package id.toki.tlx.problem;

import java.util.Scanner;

public class TemanDekat {
  static int min = -1;
  static int max = -1;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    int d;
    n = scanner.nextInt();
    d = scanner.nextInt();

    int[][] murid = new int[n][2];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2; j++) {
        murid[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        check(murid[i][0], murid[i][1], murid[j][0], murid[j][1], d);
      }
    }

    System.out.println(min + " " + max);
  }

  static void check(int x1, int y1, int x2, int y2, int d) {
    int result = (int) Math.pow(Math.abs(x1 - x2), d) + (int) Math.pow(Math.abs(y1 - y2), d);
    if (min == -1) {
      min = result;
    } else {
      if (result < min) {
        min = result;
      }
    }

    if (max == -1) {
      max = result;
    } else {
      if (result > max) {
        max = result;
      }
    }
  }
}
