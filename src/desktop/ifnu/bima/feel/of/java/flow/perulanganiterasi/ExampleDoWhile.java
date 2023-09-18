package desktop.ifnu.bima.feel.of.java.flow.perulanganiterasi;

public class ExampleDoWhile {
  /**
   * Kalau kita ingin agar iterasi terjadi setidaknya sekali saja maka kita bisa menggunakan
   * do-while
   */
  public static void main(String[] args) {
    do{
      System.out.println("Waktu sekarang dibagi 3 masih ada sisanya");
    } while (System.currentTimeMillis() % 3 != 0);
    /**
     * kalau kita eksekusi kode di atas, maka setidaknya string di atas diprint sekali, kalau misalnya
     * kondisi di dalam while masih benar maka string-nya akan dipring lagi sampai kondisi di dalam
     * while bernilai false.
     */
  }
}
