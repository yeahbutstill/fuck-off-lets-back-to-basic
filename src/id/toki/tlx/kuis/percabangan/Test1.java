package id.toki.tlx.kuis.percabangan;

public class Test1 {
  public static void main(String[] args) {
    int a, b;
    a = 10;
    b = 9;
    if (a > b / 2) System.out.println("bebek");
    else System.out.println("ayam");
    System.out.println("===========COBA===============");

    Test1 test1 = new Test1();
    test1.cobaIf1(a, b);
    test1.cobaIf2(a, b);
    test1.cobaIf3(a, b);
    test1.cobaIf4(a, b);
    test1.cobaIf5(a, b);
  } // bebek

  void cobaIf1(int a, int b) {
    if (b / 2 > a) System.out.println("bebek1");
    else System.out.println("ayam1");
  }

  void cobaIf2(int a, int b) {
    if (b / 2 > a) System.out.println("ayam2");
    else System.out.println("bebek2");
  }

  void cobaIf3(int a, int b) {
    if (2 * a > b) System.out.println("ayam3");
    else System.out.println("bebek3");
  }

  void cobaIf4(int a, int b) {
    if (b / 2 >= a) System.out.println("bebek4");
    else System.out.println("ayam4");
  }

  void cobaIf5(int a, int b) {
    if (2 * a > b) System.out.println("bebek5");
    else System.out.println("ayam5");
  }
}
