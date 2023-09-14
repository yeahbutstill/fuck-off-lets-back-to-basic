package desktop.ifnu.bima.feel.of.java.flow.exampleif;

public class BukanDariIf {
  public static void main(String[] args) {
    /**
     * Perhatikan bahwa kalau if tidak diikuti dengan tanda kurung kurawal maka yang dianggap
     * sebagai blok kode di dalam if adalah satu statement tepat di setelah if, kalau ada beberapa
     * statement setelah if, maka sisanya tidak dianggap bagian dari blok kode if. Contohnya :
     */
    int x = 0;
    if (x >= 0)
      System.out.println("nilai positif");
      System.out.println("selalu dieksekusi. Bukan bagian dari blok kode if");
    /**
     * Kalau kode di atas dieksekusi, println kedua akan selalu dieksekusi apapun nilai kondisi di dalam
     * if, hal ini karena println kedua bukan bagian dari blok kode untuk if.
     */
  }
}
