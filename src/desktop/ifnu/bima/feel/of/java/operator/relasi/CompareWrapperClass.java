package desktop.ifnu.bima.feel.of.java.operator.relasi;

public class CompareWrapperClass {
  /**
   * Operator perbandingan cukup intuitif jika digunakan untuk membandingkan nilai data dengan tipe
   * primitif, yang perlu diwaspadai adalah membandingkan dua buah variabel dengan tipe data
   * pecahan, hal ini dikarenakan tipe data pecahan double atau float tidak bisa dikendalikan nilai
   * di belakang koma, sehingga terkadang kita harus berkompromi dengan hanya membandingkan hanya
   * sampai sekian angka di belakang koma saja.
   */

  /**
   * Operator perbandingan menjadi cukup kompleks kalau digunakan untuk membandingkan nilai dari
   * tipe data reference. Dua buah data dengan tipe data reference disebut sebanding jika keduanya
   * memiliki alamat yang sama, atau bisa juga diartikan keduanya menunjuk ke object yang sama di
   * dalam memory. Hati-hati menggunakan operator perbandingan terhadap tipe data wrapper class,
   * karena hasilnya bisa diluar dugaan. Mari kita lihat kode di bawah ini :
   */
  public static void main(String[] args) {
    Integer i = new Integer(10);
    Integer x = new Integer(10);
    System.out.println("new Integer(10) == new Integer(10) ? " + (i==x));

    // pake ini kalau untuk membandingkan alamat memori yang sama atau menuju object yang sama
    System.out.println("(i.equals(x)) ? " + (i.equals(x)));

    // coba modif
    Integer i1 = 10;
    Integer x1 = 10;
    System.out.println("10 == 10 ?" + (x1 == i1));
  }
}

/**
 * Apakah anda terkejut?
 * Perhatikan di kode pertama, variabel i dan x diassign dengan sebuah object baru
 * menggunakan keyword new, artinya antara variabel i dan x akan menunjuk ke dua buah object
 * Integer yang berbeda di memory, walaupun sebenarnya nilai kedua object tersebut adalah
 * sama: 10. Sedangkan kode ke-dua, variabel i1 dan x1 diassign dengan nilai literal 10, kode ini
 * menggunakan feature autoboxing/unboxing dari java 5 untuk mengassign nilai literal 10 ke
 * dalam wrapper class, sehingga kedua object ini sama-sama menunjuk ke nilai yang sama, yaitu
 * literal 10.
 */

/**
 * Anda harus benar-benar jeli untuk menggunakan operator perbandingan ini kalau tipe datanya
 * reference atau wrapper class. Gunakan method equals yang ada di wrapper class atau di tipe
 * data reference untuk membandingkan apakah kedua data mempunyai kesamaan secara logika,
 * karena operator perbandingan sebenarnya membandingkan alamat memory bukan
 * membandingkan apakah kedua object secara logika sama atau tidak. Kita akan membahas
 * topik “object equality” lebih lanjut di bab OOP tentang method equals dan hashCode, jadi kalau
 * sekarang masih belum terlalu ngeh tentang topik ini, masih ada satu sesi lagi yang akan
 * membahas lebih dalam di bab selanjutnya.
 */