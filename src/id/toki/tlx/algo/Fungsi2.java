package id.toki.tlx.algo;

public class Fungsi2 {
  public static void kalimat() {
    System.out.println("Di dalam method kalimat");
  }

  public static void main(String[] args) {
    kalimat();
    System.out.println("Di dalam main");
    kalimat();
  }
}
