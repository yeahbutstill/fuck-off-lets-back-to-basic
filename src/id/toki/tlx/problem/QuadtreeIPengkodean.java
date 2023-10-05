package id.toki.tlx.problem;

import java.util.Scanner;

public class QuadtreeIPengkodean {
  static int ans;
  static String[] array = new String[128 * 128];
  static int[][] grid = new int[128][128];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int max = Math.max(x, y);
    int power = 1;

    while (power < max) {
      power = power * 2;
    }
    for (int i = 0; i < power; i++) {
      for (int j = 0; j < power; j++) {
        grid[i][j] = 0;
      }
    }

    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        grid[i][j] = sc.nextInt();
      }
    }

    quadTree(0, 0, power, "");
    System.out.println(ans);
    for (int i = 0; i < ans; i++) {
      System.out.println(array[i]);
    }
  }

  static void quadTree(int x, int y, int leng, String code) {
    if (homogen(x, y, leng)) {
      if (grid[x][y] == 1) {
        array[ans] = "1" + code;
        ans++;
      }
    } else {
      quadTree(x, y, leng / 2, code + "0");
      quadTree(x, y + leng / 2, leng / 2, code + "1");
      quadTree(x + leng / 2, y, leng / 2, code + "2");
      quadTree(x + leng / 2, y + leng / 2, leng / 2, code + "3");
    }
  }

  static boolean homogen(int x, int y, int leng) {
    int value = grid[x][y];
    for (int i = x; i < x + leng; i++) {
      for (int j = y; j < y + leng; j++) {
        if (grid[i][j] != value) return false;
      }
    }
    return true;
  }
}
