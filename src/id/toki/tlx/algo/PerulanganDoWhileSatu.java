package id.toki.tlx.algo;

public class PerulanganDoWhileSatu {
  public static void main(String[] args) {
    int i = 15;
    System.out.println("Perulangan Menggunakan Do..While");
    System.out.println("====================================");

    do {
      System.out.println("Angka Perulangan : " + i);
      i -= 2;
    } while (i >= 1);
  }
}
