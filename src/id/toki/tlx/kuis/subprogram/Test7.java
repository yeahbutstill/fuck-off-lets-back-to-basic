package id.toki.tlx.kuis.subprogram;

public class Test7 {
  static int a;

  public static void main(String[] args) {
    Test7 test7 = new Test7();
    a = 2;
    test7.tugas1(3);
    test7.tugas2(4);
    System.out.print(a);
  }

  void tugas1(int x) {
    a = x;
  }

  void tugas2(int x) {
    int a = x;
  }
}
