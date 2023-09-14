package desktop.ifnu.bima.feel.of.java.flow.exampleswitch;

public class BreakFallThrough {
  public static void main(String[] args) {
    int x = 1;
    switch (x) {
      case 0:
        System.out.println("nol");
      case 1:
        System.out.println("1 fall through");
        break;
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
     * dieksekusi hingga ketemu break atau blok kode switch berakhir. Kalau kita ubah sedikit kode
     * di atas dengan meletakkan break di dalam case 1
     */
  }
}

/**
 * if dan switch adalah flow control yang digunakan kalau aplikasi berjalan dengan baik, artinya flow
 * control oleh if dan switch digunakan untuk mengendalikan aliran eksekusi aplikasi kalau sema
 * berjalan seperti yang dikehendaki. Java mempunyai cara untuk mengontrol aliran aplikasi kalau
 * terjadi error di dalam aplikasi, namanya adalah exception. Kita bahas apa itu exception di bab
 * berikutnya.
 */
