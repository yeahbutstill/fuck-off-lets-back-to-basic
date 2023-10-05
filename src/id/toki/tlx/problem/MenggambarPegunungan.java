package id.toki.tlx.problem;

import java.util.Collections;
import java.util.Scanner;

public class MenggambarPegunungan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    MenggambarPegunungan mp = new MenggambarPegunungan();
    mp.recursion(h);
    sc.close();
  }

  void recursion(int h) {
    if (h > 0) {
      recursion(h - 1);
      System.out.println(String.join("", Collections.nCopies(h, "*")));
      recursion(h - 1);
      return;
    }
  }
}
