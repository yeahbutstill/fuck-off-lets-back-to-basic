package desktop.ifnu.bima.feel.of.java.flow.perulanganiterasi;

import java.time.LocalDateTime;

public class ExampleWhile {
  public static void main(String[] args) {
    /**
     * Sintaks while diawali dengan keyword while kemudian diikuti dengan kurung buka, di dalam
     * kurung buka ada satu kondisi, dan diakhiri kurung tutup, setelah itu ada pasangan kurung
     * kurawal buka tutup.
     */
    boolean time = System.currentTimeMillis() % 3 != 0;
    // Jumlah iterasi dalam kode di atas tidak menentu, terkadang iterasi bisa terjadi banyak kali,
    // sedikit kali atau bahkan tidak terjadi iterasi sama sekali.
    while (time) {
      /**
       * Kita akan membuat contoh kecil yang akan mengambil nilai waktu sekarang, mengetes apakah
       * waktu sekarang ini kalau dibagi 3 sisanya 0, selama tidak memenuhi kondisi di atas maka iterasi
       * dijalankan terus menerus.
       */
      System.out.println("Waktu sekarang dibagi 3 masih ada sisanya: " + time);
    }
  }
}
