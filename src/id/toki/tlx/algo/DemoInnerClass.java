package id.toki.tlx.algo;

public class DemoInnerClass {
  public static void main(String[] args) {
    Luar obj = new Luar();
    // Luar.Dalam obj2 = new Luar.Dalam(); // Salah
    obj.setA(5);
    obj.showData();
  }
}
