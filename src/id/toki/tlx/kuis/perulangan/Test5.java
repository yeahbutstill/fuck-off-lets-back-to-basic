package id.toki.tlx.kuis.perulangan;

public class Test5 {
  public static void main(String[] args) {
    int n = 100;
    int i = 0;
    while (n > 1) {
      i = i + 1;
      n = n - (n / 2);
    }
    System.out.println(i);
  }
}
