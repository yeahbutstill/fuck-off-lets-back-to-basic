package desktop.ifnu.bima.feel.of.java.gc;

import java.util.Date;

public class CobaMati {
  /**
   * Jika suatu object tidak dapat lagi diakses oleh thread yang masih hidup, maka bisa dipastikan
   * bahwa object tersebut sudah tidak bisa digunakan lagi. Object dalam keadaan inilah yang akan
   * dihapus Garbage Collector dari dalam heap. Java akan kehabisan memory kalau aplikasi terus
   * membuat object baru dan object-object tersebut masih bisa diakses oleh thread yang sedang hidup
   * sehingga Garbage Collector tidak bisa menghapus dari heap, sampai pada akhirnya heap penuh.
   * Kita bisa secara sengaja membuat sebuah object tidak bisa lagi diakses dari thread yang masih
   * hidup, cara yang paling mudah adalah dengan mengeset variabel yang memegang reference ke object
   * tersebut menjadi null. Contohnya seperti berikut ini :
   */
  public static void main(String[] args) {

    Date d = new Date();
    // Setelah variabel d di set ke null maka object Date di atas tidak bisa lagi diakses oleh
    // variabel lainya karena alamat ke object tersebut tidak ada lagi yang tahu.
    d = null;

    /**
     * Cara lainya adalah dengan mengganti nilai dari variabel dengan object lain, sehingga object
     * sebelumnya tidak lagi bisa diakses. Contohnya seperti berikut :
     */
    Date d1 = new Date();
    d1 = new Date();
    // Kode di atas membuat dua buah object dari class Date, object pertama akan dihapus dari heap
    // ketika Garbage Collector berjalan.
  }
}
