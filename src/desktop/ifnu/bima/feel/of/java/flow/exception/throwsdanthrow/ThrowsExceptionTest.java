package desktop.ifnu.bima.feel.of.java.flow.exception.throwsdanthrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {
  /**
   * dengan melempar exception ke method pemanggilnya. Solusi kedua ini terbalik dengan solusi
   * pertama yang langsung menghandle exception di tempat, solusi kedua ini malah melempar tanggung
   * jawab ke method pemanggilnya untuk menghandle exception, jadi methodnya cuci tangan dan tidak
   * bertanggung jawab. Nah sekarang pertanyaanya, bagimana kalau tidak ada satupun method
   * pemanggilnya yang menangkap exception ini? Kalau hal ini terjadi, maka aplikasi akan keluar
   * dari eksekusi (ingat analogi call stack dengan gedung tinggi). Sintaks untuk melempar tanggung
   * jawab menangkap exception menggunakan keyword throws yang diletakkan di deklarasi method.
   */
  public static void main(String[] args) throws FileNotFoundException {
    FileInputStream fileInputStream = new FileInputStream("README.txt");
    System.out.println(fileInputStream);
    /**
     * Perhatikan kode di atas, tanpa ada try-catch kodenya tidak akan menyebabkan error pada
     * waktu kompilasi. Kuncinya ada pada keyword throws di sebelah method main, dengan adanya
     * throws ini maka method main tidak wajib melakukan try-catch terhadap kedua tipe exception.
     * Nah karena method main adalah method paling bawah dari call stack, maka kalau ada
     * exception yang tidak dihandle oleh method main ini aplikasi akan langsung keluar. Ingat,
     * aturan ini hanya berlaku untuk checked exception, sedangkan unchecked exception tidak perludi
     * try-catch ataupun throws.
     */
  }
}
