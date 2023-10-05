package id.toki.tlx.problem;

import java.util.Scanner;

public class CaesarCipher {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder s = new StringBuilder(in.next());
    int k = in.nextInt();
    int n = s.length();
    char[] words = s.toString().toCharArray();

    s = new StringBuilder();
    for (int i = 0; i < n; i++) {
      words[i] = (char) (words[i] + k);
      if (words[i] > 122) {
        words[i] = (char) (words[i] % 123 + 97);
      }
      s.append(words[i]);
    }
    System.out.println(s);
  }
}
