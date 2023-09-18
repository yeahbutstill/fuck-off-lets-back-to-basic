package desktop.ifnu.bima.feel.of.java.flow.exception.throwsdanthrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DiLemparLaluDitangkap {
  /**
   * Kita lihat lagi contoh bagaimana kalau exception dilempar di satu method dan pada akhirnya
   * exception tersebut ditangkap di method pemanggilnya.
   */

  // yang kena tai
  public static void main(String[] args) {
    try {
      methodTidakBertanggungJawab();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println("kode di dalam method main");
  }

  // ngelempar tai
  public static void methodTidakBertanggungJawab() throws FileNotFoundException {
    /**
     * di dalam method methodTidakBertanggungJawab, exception tidak dihandle tetapi dilempar ke
     * metod pemanggilnya dengan menggunakan sintaks throws. Sedangkan method main yang
     * memanggil method methodTidakBertanggungJawab, akhirnya menghandle exception sehingga
     * eksekusi aplikasi tidak langsung keluar dan dilanjutkan dengan mecetak string di bawahnya baru
     * kemudian keluar.
     */
    FileInputStream fileInputStream = new FileInputStream("README.txt");
    System.out.println("kode setelah buka file");
  }
}
