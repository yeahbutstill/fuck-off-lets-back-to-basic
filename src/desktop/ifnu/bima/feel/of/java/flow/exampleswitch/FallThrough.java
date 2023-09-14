package desktop.ifnu.bima.feel.of.java.flow.exampleswitch;

public class FallThrough {
  public static void main(String[] args) {
    int x = 1;
    switch (x) {
      case 0:
        System.out.println("nol");
      case 1:
        System.out.println("1 fall through");
      case 2:
        System.out.println("2 fall through");
      case 3:
        System.out.println("3 fall through");
      case 4:
        System.out.println("4 fall through");
      default:
        System.out.println("default fall through");
    }
    /**
     * Perhatikan bahwa setelah kondisi di case benar, maka semua kode di dalam case akan
     * dieksekusi hingga ketemu break atau blok kode switch berakhir.
     */
  }
}
