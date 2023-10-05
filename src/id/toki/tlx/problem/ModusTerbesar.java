package id.toki.tlx.problem;

import java.util.Scanner;

public class ModusTerbesar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int x[] = new int[1001];
    int max = 0;
    int put = 0;

    for (int i = 0; i < n; i++) {
      put = input.nextInt();
      x[put]++;
    }

    for (int i = 0; i < 1001; i++) {
      if (x[i] > max) {
        max = x[i];
      }
    }

    for (int i = 1000; i >= 0; i--) {
      if (max == x[i]) {
        System.out.println(i);
        break;
      }
    }

    input.close();
  }
}
