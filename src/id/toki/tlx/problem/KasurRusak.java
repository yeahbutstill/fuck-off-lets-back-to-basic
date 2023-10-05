package id.toki.tlx.problem;

import java.util.Scanner;

public class KasurRusak {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    if (palindrome(str)) {
      System.out.println("YA");
    } else {
      System.out.println("BUKAN");
    }
  }

  static boolean palindrome(String word) {
    if (word.length() < 2) {
      return true;
    } else {
      if (word.charAt(0) == word.charAt(word.length() - 1)) {
        return palindrome(word.substring(1, word.length() - 1));
      } else {
        return false;
      }
    }
  }
}
