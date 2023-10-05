package id.toki.tlx.algo;

public class Konversi {
  public static void main(String[] args) {
    float m;
    float cm;
    float inci;
    m = 30;
    cm = m * 100;
    inci = m * 100 / 2.54f;
    System.out.println("Ukuran dalam CM = " + cm);
    System.out.println("Ukuran dalam Inci = " + inci);
  }
}
