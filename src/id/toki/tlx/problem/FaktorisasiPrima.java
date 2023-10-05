package id.toki.tlx.problem;

import java.util.Scanner;

public class FaktorisasiPrima {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 2; i <= n; i++) {
      int power = 0;
      while (n % i == 0) {
        n /= i;
        power++;
      }

      if (power > 0) {
        System.out.print(i);
        if (power > 1) System.out.print("^" + power);
        if (n > 1) {
          System.out.print(" x ");
        }
      }
    }
  }
}
