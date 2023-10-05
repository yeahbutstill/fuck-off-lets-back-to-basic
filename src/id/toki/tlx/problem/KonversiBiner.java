package id.toki.tlx.problem;

import java.util.Scanner;

public class KonversiBiner {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(biner(n));
  }

  static String biner(int number) {
    if (number == 1) {
      return "1";
    } else {
      if (number % 2 == 0) {
        return biner(number / 2) + "0";
      } else {
        return biner(number / 2) + "1";
      }
    }
  }
}
