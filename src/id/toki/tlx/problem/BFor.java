package id.toki.tlx.problem;

import java.util.Scanner;

public class BFor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      temp += x;
    }
    System.out.println(temp);
  }
}
