package id.toki.tlx.problem;

import java.util.Scanner;

public class BrankasTerkunci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] array = new int[k];
    rekursif(n, k, array, 0, 1);
  }

  static void rekursif(int n, int k, int[] array, int total, int start) {
    if (total == k) {
      print(array);
      return;
    }
    for (int i = start; i <= n - (k - total) + 1; i++) {
      array[total] = i;
      rekursif(n, k, array, total + 1, i + 1);
    }
  }

  static void print(int[] array) {
    for (int j : array) {
      System.out.print(j + " ");
    }
    System.out.println();
  }
}
