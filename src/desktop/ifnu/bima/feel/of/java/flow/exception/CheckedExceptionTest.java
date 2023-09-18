package desktop.ifnu.bima.feel.of.java.flow.exception;

import java.io.FileInputStream;

public class CheckedExceptionTest {
  public static void main(String[] args) {
    /**
     * Class Exception yang bukan turunan dari RuntimeException disebut dengan checked exception.
     * Kode yang didalamnya ada exception dengan tipe ini harus diletakkan dalam blok try, kalau tidak,
     * maka akan terjadi kompilasi error. Sebagai contoh kita akan menulis kode untuk membuka fle,
     * kode ini mengandung checked exception yaitu IOException. Pertama kita lihat dulu kode tanpa
     * try, kode ini akan menyebabkan adanya kompilasi error :
     */
    // FileInputStream fileInputStream = new FileInputStream("README.txt");
    // terlihat pada output proses kompilasi di atas bahwa konstruktor new FileInputStream("README.txt"); melempar exception yang harus ditangkap (catch) atau dideklarasikan untuk dilempar
    // (throw) lagi.
    // System.out.println(fileInputStream);
    System.out.println("kode setelah buka file");
  }
}
