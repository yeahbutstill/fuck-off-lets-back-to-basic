package id.toki.tlx.problem;

import java.util.Scanner;

public class IfThenElse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n > 0) {
      System.out.println("positif");
    } else if (n < 0) {
      System.out.println("negatif");
    } else {
      System.out.println("nol");
    }
  }
}
