package id.toki.tlx.problem;

import java.util.Scanner;

public class DWhilePencacah {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cacah = 0;
    while (sc.hasNextInt()) {
      int angka = sc.nextInt();
      cacah += angka;
    }
    System.out.println(cacah);
  }
}
