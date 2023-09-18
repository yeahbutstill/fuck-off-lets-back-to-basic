package desktop.ifnu.bima.feel.of.java.flow.exception;

public class RuntimeException2Test {
  public static void main(String[] args) {
    /**
     * Misalnya kita tidak yakin dengan String yang akan diubah menjadi integer berhasil atau tidak,
     * kita bisa meletakkan statement try-catch, kalau ada error nilai integer kita set menjadi 0
     */
    int i = 0;
    try {
      i = Integer.parseInt("Abc");
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }

    System.out.println("kode setelah exception");
  }
  /**
   * Kalau kita jalankan kode di atas, maka setelah terjadi exception pada waktu mengeksekusi method
   * parseInt, eksekusi akan meloncat ke dalam catch, mencetak stack trace ke console kemudian
   * melanjutkan eksekusi untuk mencetak string “kode setelah exception” ke console. Dengan
   * modifkasi di atas, kode menjadi lebih handal dan tidak menyebabkan program keluar sebelum
   * eksekusi selesai semuanya.
   */
}
