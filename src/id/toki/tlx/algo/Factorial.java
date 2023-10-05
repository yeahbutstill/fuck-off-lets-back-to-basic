package id.toki.tlx.algo;

public class Factorial {
  public static void main(String[] args) {
    Factorial f = new Factorial();
    System.out.print("8!= ");
    System.out.print(f.hitungFactorial(8));
  }

  private int hitungFactorial(int x) {
    if (x == 1) {
      return 1;
    } else {
      return x * hitungFactorial(x - 1);
    }
  }
}
