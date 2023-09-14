package desktop.ifnu.bima.feel.of.java.flow.exampleif;

public class Example {
  public static void main(String[] args) {
    /**
     * Statement if digunakan dalam aplikasi untuk mengatur aliran eksekusi program berdasarkan
     * kondisi tertentu. Sintaks dasarnya adalah sebagi berikut :
     */
    int x = 10;
    if (x == 10) {
      System.out.println("lakukan sesuatu di sini kalau kondisi di dalam if bernilai true");
    }

    /**
     * Kode di dalam kurung kurawal buka dan tutup akan dieksekusi kalau kondisi di dalam statement
     * if bernilai true. Statement if bisa digabungkan dengan else, kode di dalam else akan
     * dieksekusi kalau kondisi di dalam if bernilai false, contohnya :
     */
    int x1 = 12;
    if (x1 == 10) {
      System.out.println("lakukan sesuatu ini true");
    } else {
      System.out.println("lakukan sesuatu ini false");
    }

    // Ada juga bentuk else if yang dirangkai untuk mengetes beberapa kondisi, seperti di bawah ini
    int nilai = 78;
    if (nilai == 40) {
      System.out.println("nilai < 40 = D");
    } else if (nilai >= 40 && nilai < 60) {
      System.out.println("nilai >= 40 && nilai < 60 = C");
    } else if (nilai >= 60 && nilai < 80) {
      System.out.println("nilai >= 60 && nilai < 80 = B");
    } else if (nilai >= 80 && nilai < 100) {
      System.out.println("nilai >= 80 && nilai < 10 = A");
    } else {
      System.out.println("range nilai harus antara 0-100");
    }

    /**
     * Tanda kurung kurawal tidak diperlukan kalau blok kode yang dieksekusi di dalam if hanya satu
     * baris saja, tetapi praktek ini tidak dianjurkan karena menimbulkan kebingungan, misalnya :
     */
    int haha = 0;
    if (haha >= 0) System.out.println("nilai positif");
  }
}
