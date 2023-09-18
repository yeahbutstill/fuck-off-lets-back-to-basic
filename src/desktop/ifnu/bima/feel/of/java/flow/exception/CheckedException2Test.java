package desktop.ifnu.bima.feel.of.java.flow.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException2Test {
  public static void main(String[] args) {
    try {
      FileInputStream fileInputStream = new FileInputStream("README.txt");
      System.out.println(fileInputStream);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("kode setelah input stream");
  }
}

/**
 * IOException dan FileNotFoundException adalah turunan Exception, sehingga bisa juga kita
 * tangkap dengan tipe Exception, kalau ini yang kita lakukan maka semua class exception
 * turunan dari Exception akan ikut ditangkap juga. Praktek “tangkap semua exception tanpa
 * pandang bulu” seperti ini dikategorikan sebagai praktek kurang baik, karena semua jenis
 * exception akan dihandle dengan cara yang sama, padahal kita bisa menghandle exception
 * dengan lebih baik kalau bisa memilah-milah cara menghandle exception berdasar tipenya.
 * Menangkap exception terbalik dengan menangkap koruptor, kalau koruptor harus ditangkap
 * tanpa pandang bulu, sedangkan exception harus ditangkap dengan cara dipilah-pilah
 * berdasarkan tipenya.
 */
