package id.toki.tlx.kuis.percabangan;

public class Test4 {
  public static void main(String[] args) {
    int a = 26;
    if (!(a % 2 == 1)) {
      System.out.printf("genap ");
    } else {
      System.out.printf("ganjil ");
    }

    if (a > 0) {
      System.out.printf("positif\n");
    } else if (a < 0) {
      System.out.printf("negatif\n");
    } else {
      System.out.printf("nol\n");
    }
  }
}
