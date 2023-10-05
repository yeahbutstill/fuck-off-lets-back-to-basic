package id.toki.tlx.problem;

import java.util.Scanner;

public class JarakManhattan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x;
    int y;
    int x1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y1 = sc.nextInt();
    int y2 = sc.nextInt();

    x = x1 - y1;
    y = x2 - y2;

    if (x < 0) x *= -1;
    if (y < 0) y *= -1;

    System.out.println(x + y);
  }
}
