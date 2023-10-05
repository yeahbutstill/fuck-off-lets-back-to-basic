package id.toki.tlx.problem;

import java.util.Scanner;

public class KomposisiFungsi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    int x1 = sc.nextInt();

    while (k-- > 0) {
      x1 = func(a, b, x1);
    }
    System.out.println(x1);
  }

  public static int func(int a, int b, int x1) {
    return Math.abs(a * x1 + b);
  }
}
