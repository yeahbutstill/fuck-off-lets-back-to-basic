package desktop.ifnu.bima.feel.of.java.oop.collectiondangenerics;

public class ToStringDanEqualsTest {
  public static void main(String[] args) {
    ToStringDanEqualsTest t = new ToStringDanEqualsTest();
    System.out.println(t);
    System.out.println();

    var dani = new Kontak();
    dani.setNama("Dani");
    dani.setNumber("000808080");
    System.out.println(dani);

    var mayaDani = new Kontak();
    mayaDani.setNama(dani.getNama());
    mayaDani.setNumber(dani.getNumber());
    System.out.println(mayaDani);

    /*
      Operator == bisa digunakan untuk membandingkan dua buah object,
      tetapi perbandingan inihanya akan menghasilkan true kalau dua buah object apakah berada dalam memory yang
      sama, atau bisa dikatakan dua buah object ini mempunyai reference yang sama persis.
    */
    System.out.println(dani == mayaDani);
    /*
      apakah output dari kode di atas? Menggunakan operator == maka hasilnya adalah false
      karena kedua variabel Kontak diinisialisasi dengan menggunakan "new"
    */

    /*
      Method equals digunakan untuk membandingkan antara dua buah object apakah sama atau tidak secara logis.
      Method equals akan mengembalikan true kalau kedua object sama secara logis walaupun
      kedua object mempunyai reference berbeda (tidak berada di memory yang sama).
    */
    System.out.println(dani.equals(mayaDani));

    int a = 11;
    int b = 11;
    /*
     Kalau operator == mengembalikan nilai true berarti dua buah object ini adalah sama persis
     baik secara alamat memory dan otomatis sama secara logis.
    */
    System.out.println(a == b);
    System.out.println(dani == dani);
  }
}

/***
 * Kalau ingin membandingkan dua buah object apakah sama secara logis, kita akan
 * menggunakan method equals, tetapi masalahnya adalah implementasi method equals dari class
 * Object sama persis dengan operator ==, sehingga harus dioverride agar walaupun dua buah
 * object yang berbeda tetap dianggap sama asalkan suatu kriteria terpenuhi. Seperti yang
 * terjadi dengan class String dalam contoh di atas, method equalsnya dioverride agar
 * mengembalikan true kalau dua buah object dari class String mempunyai nilai string yang
 * sama.
 */
