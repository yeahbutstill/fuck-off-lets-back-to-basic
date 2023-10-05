package id.toki.tlx.problem;

import java.util.Scanner;

public class GayaPenulisanVariabel {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    scan.close();
    boolean isCaps = false;
    for (int i = 0; i < s.length(); i++) {
      if (isCaps) {
        System.out.print((char) ((int) s.charAt(i) ^ 32));
        isCaps = false;
      } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
        System.out.printf("_%c", (char) ((int) s.charAt(i) ^ 32));
      } else if (s.charAt(i) == '_') {
        isCaps = true;
      } else {
        System.out.print(s.charAt(i));
      }
    }
  }
}
