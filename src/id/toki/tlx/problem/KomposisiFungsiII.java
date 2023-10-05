package id.toki.tlx.problem;

import java.util.Scanner;

public class KomposisiFungsiII {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    System.out.println(func(a, b, x, k));
  }

  private static int func(int a, int b, int x, int rec) {
    if (rec == 1) {
      return Math.abs(a * x + b);
    } else {
      return func(a, b, Math.abs(a * x + b), rec - 1);
    }
  }
}
