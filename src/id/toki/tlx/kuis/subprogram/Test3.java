package id.toki.tlx.kuis.subprogram;

public class Test3 {
  public static void main(String[] args) {
    Test3 test3 = new Test3();
    test3.cetak2(3);
  }

  void cetak1(int x) {
    for (int i = 0; i < x; i++) {
      System.out.print("x");
    }
    System.out.print(".");
  }

  void cetak2(int x) {
    for (int i = 1; i <= x; i++) {
      cetak1(i);
    }
  }
}
