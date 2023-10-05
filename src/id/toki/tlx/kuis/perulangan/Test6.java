package id.toki.tlx.kuis.perulangan;

public class Test6 {
  public static void main(String[] args) {
    int a = 45;
    int b = 56;
    do {
      a = a - 3;
      b = b - 5;
    } while ((a >= 0) || (b >= 0));
    System.out.println(a + " " + b);
  }
}
