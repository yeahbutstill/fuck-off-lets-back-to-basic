package id.toki.tlx.problem;

public class Test {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] b = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    for (int i = 0; i < 10; i++) {
      a[i] = (3 * i) % 10;
    }
    for (int i = 0; i < 10; i++) {
      b[i] = 9 * a[((i + 3) % 10)] + 5 % 10;
    }
    System.out.println(b[8]);
  }
}
