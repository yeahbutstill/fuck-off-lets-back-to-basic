package id.toki.tlx.problem;

import java.util.Scanner;

public class PolaIII {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 0;

    for (int i = 0; i < n; i++) {
      int tmp = 0;
      while (tmp <= b) {
        System.out.print(a);
        if (a < 9) {
          a++;
        } else {
          a = 0;
        }
        tmp++;
      }
      b++;
      System.out.println();
    }
  }
}
