package desktop.ifnu.bima.feel.of.java.operator.logika;

public class InversiAtauNegasi {
  public static void main(String[] args) {
    /**
     * Operator ! disebut sebagai inversi atau negasi, operator ini akan membalik nilai boolean true
     * menjadi false dan false menjadi true. Misalnya kode di bawah ini :
     */
    int x = 10;
    int y = 11;
    boolean z1 = ((x >= 10) ^ (y < 100));
    boolean z2 = !((x >= 10) ^ (y < 100));
    System.out.println(z1);
    System.out.println(z2);
    // variabel z2 akan bernilai true karena operasi (x >= 10) ^ (y < 100) bernilai false di z2.
  }
}

/**
 * Secara umum, hanya operator &&, || dan ! yang akan kita gunakan dalam contoh aplikasi di
 * buku ini, sisanya jarang sekali digunakan dalam aplikasi sebenarnya.
 */
