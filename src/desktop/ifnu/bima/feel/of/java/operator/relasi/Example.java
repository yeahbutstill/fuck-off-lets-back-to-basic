package desktop.ifnu.bima.feel.of.java.operator.relasi;

public class Example {
  /**
   * Operator relasi selalu menghasilkan data boolean (true atau false), operator ini sering
   * digunakan untuk mengecek sebuah kondisi dan diletakkan di dalam percabangan (if). Operator
   * relasi ada enam jenis
   */
  public static void main(String[] args) {
    int x = 300;
    if (x > 100) System.out.println("x lebih besar dari 100");

    // hasil dari operasi relasi bisa diassing ke variable dengan tipe boolean
    int x1 = 500;
    boolean b = x < 1000;
    System.out.println(b);

    /**
     * Operator >, <, >= dan <= bisa digunakan untuk membandingkan semua tipe data bilangan
     * bulat, bilangan pecahan dan karakter (char), baik dalam bentuk variabel ataupun dalam bentuk
     * literal. Sedangkan operator perbandingan (== dan !=) bisa digunakan untuk mengoperasikan
     * semua tipe data, dari primitif, wrapper class hingga tipe data reference.
     */
  }
}
