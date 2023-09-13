package desktop.ifnu.bima.feel.of.java.gc;

import java.util.Date;

public class GarbageCollector {

  // Variabel lokal yang dideklarasikan di dalam sebuah method boleh dihapus oleh Garbage Collector
  // kalau eksekusi method selesai. Kalau tidak diperlukan, sebaiknya variabel dideklarasikan di
  // dalam method agar mudah dihapus dari memory. Perhatikan contoh berikut ini :
  public static Date getDate() {
    StringBuffer buffer = new StringBuffer("garbage collectable");
    Date date = new Date();
    System.out.println(buffer);
    return date;
  }

  public static void main(String[] args) {
    Date d = getDate();
    // lakukan sesuatu di sini
    System.out.println(d);
  }

  /**
   * Kode di atas terdapat dua buah object di dalam method getDate, object pertama adalah
   * StringBuffer dan object kedua adalah Date. Object StringBuffer bisa dihapus oleh Garbage
   * Collector setelah eksekusi method getDate selesai dilaksanakan, sedangkan object Date tidak bisa
   * dihapus karena referencenya dipegang oleh variabel d di dalam method main.
   */
}
