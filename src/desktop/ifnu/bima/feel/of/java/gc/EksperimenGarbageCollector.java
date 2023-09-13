package desktop.ifnu.bima.feel.of.java.gc;

import java.util.Date;

public class EksperimenGarbageCollector {
  /**
   * Seperti yang sudah kita bahas, kita bisa “menganjurkan” Garbage Collector untuk berjalan dari
   * dalam kode aplikasi kita. Caranya adalah memanggil method gc dari class System seperti di bawah
   * ini : System.gc();
   */

  /**
   * Di dalam JVM tidak ada garansi bahwa setelah method gc dipanggil maka Garbage Collector akan
   * segera berjalan. Ada kalanya Garbage Collector langsung berjalan ada kalanya tidak. Secara
   * praktek, kita tidak perlu memanggil kode ini, kecuali kalau anda membuat aplikasi Java ME.
   * Pemanggilan System.gc() lazim dilakukan dalam aplikasi Java ME, walaupun sebenernya tidak
   * dianjurkan, terutama setelah operasi pembacaan data dari server atau dari media penyimpanan.
   * Mari kita coba sedikit eksperimen untuk mengetes apakah setelah method gc dipanggil Garbage
   * Collector langsung berjalan apa tidak, eksperimen ini melibatkan kode untuk menghitung berapa
   * banyak memory yang tersedia dalam JVM.
   */
  public static void main(String[] args) {
    Runtime rt = Runtime.getRuntime();
    System.out.println("Jumlah memory awal: " + rt.totalMemory());
    for (int i = 1; i < 1000000; i++) {
      Date d = new Date();
      d = null;
    }

    System.out.println("Jumlah memory tersedia sebelum gc: " + rt.freeMemory());
    System.gc();
    System.out.println("Jumlah memory tersedia setelah gc: " + rt.freeMemory());
  }
  // Dalam kasus di atas setelah eksekusi method gc, Garbage Collector segera berjalan
  // sehingga memory yang digunakan aplikasi menjadi berkurang, ditandai dengan naiknya jumlah
  // memory
  // yang tersedia.

  /**
   * Ada istilah stop-the-world ketika kita bicara tentang Garbage Collector, istilah ini digunakan
   * untuk menggambarkan keadaan di dalam JVM dimana semua thread akan berhenti bekerja
   * ketika Garbage Collector berjalan. Gejala yang terlihat adalah aplikasi tiba-tiba berhenti
   * sebentar (pause) dan tidak dapat melayani request dari user. Setelah java 6 diperkenalkan
   * parallel Garbage Collector yang bisa berjalan parallel dan tidak menyebabkan aplikasi
   * mengalami keadaan stop-the-world.
   */

  /**
   * Sun JDK mempunyai beberapa algoritma Garbage Collector, kita bisa memilih algoritma apa
   * yang digunakan dengan menggunakan parameter JVM. Kita tidak membahas lebih lanjut
   * tentang Garbage Collector, karena topik ini adalah topik yang sangat lanjut dan seharusnya
   * dikerjakan oleh developer berpengalaman. Bahkan, sebaiknya anda tidak mengutak-utik
   * algoritma Garbage Collector kalau aplikasi masih berjalan dengan baik, hanya dalam keadaan
   * yang cukup terpaksa maka kita bisa mencoba memilih algoritma apa yang cocok digunakan.
   */

  
}
