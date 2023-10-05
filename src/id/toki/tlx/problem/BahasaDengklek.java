package id.toki.tlx.problem;

import java.util.Scanner;

public class BahasaDengklek {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder s;
    char[] words;
    s = new StringBuilder(in.next());
    words = s.toString().toCharArray();
    s = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      if (words[i] < 97) {
        words[i] = Character.toLowerCase(words[i]);
      } else {
        words[i] = Character.toUpperCase(words[i]);
      }
      s.append(words[i]);
    }
    System.out.println(s);
  }
}
