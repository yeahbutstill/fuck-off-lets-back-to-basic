package desktop.ifnu.bima.classexception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Class Exception yang bukan turunan dari RuntimeException disebut dengan checked exception.
 * Kode yang didalamnya ada exception dengan tipe ini harus diletakkan dalam blok try, kalau tidak,
 * maka akan terjadi kompilasi error. Sebagai contoh kita akan menulis kode untuk membuka fle,
 * kode ini mengandung checked exception yaitu IOException. Pertama kita lihat dulu kode tanpa
 * try, kode ini akan menyebabkan adanya kompilasi error :
 */

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("buka-file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("kode setalh buka file");
    }
}
