package id.toki.tlx.problem;

import java.util.Scanner;

public class EDuaPangkat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (isPangkat(n)) System.out.println("ya");
    else System.out.println("bukan");
  }

  public static boolean isPangkat(int num) {
    if (num <= 0) return false;
    return (num & (num - 1)) == 0;
  }
}
