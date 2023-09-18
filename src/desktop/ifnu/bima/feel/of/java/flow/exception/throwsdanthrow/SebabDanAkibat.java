package desktop.ifnu.bima.feel.of.java.flow.exception.throwsdanthrow;

import desktop.ifnu.bima.feel.of.java.flow.exception.UserNotFoundException;

public class SebabDanAkibat {
  public static void main(String[] args) throws UserNotFoundException {
    try {
      System.out.println("eksekusi exception pertama");
      /**
       * Nah, kalau kita menangkap sesuatu pasti pada awalnya kan ada yang melempar exception ini.
       * Hukum sebab-akibat juga berlaku untuk exception, dimana ada sebab (throw exception) ada
       * juga akibat (handle exception dengan try-cath atau throws). Keyword throw (tanpa s) adalah
       * awal dimana exception dibuat untuk kemudian dilempar pertama kalinya.
       */
      throw new UserNotFoundException("user tidak ditemukan");
    } catch (UserNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println("tetep diekse");
  }
}

/**
 * Keyword throw banyak digunakan dalam class-class library dalam java untuk memberitahu kode
 * dalam aplikasi kita bahwa telah terjadi error. Sebagian besar libary java yang berhubungan
 * dengan I/O (Input/Output) akan menthrow exception kalau ada masalah dalam I/O, misalnya
 * dalam contoh pembacaan fle di atas ada exception yang menerangkan bahwa fle tidak ketemu
 * (FileNotFoundException) atau ada masalah pada saat pembacaan fle (IOException).
 */

/**
 * Keyword throw jarang sekali digunakan dalam kode aplikasi, kecuali dalam keadaan dimana kita
 * ingin memberitahu bagian lain dalam aplikasi bahwa sudah terjadi error. Arsitektur aplikasi
 * modern biasanya mengikuti pola “separation of concern”, artinya pemisahan kode-kode tertentu
 * dalam lapisan berbeda. Misalnya kode untuk mengakses database dan kode untuk user interface
 * (UI) diletakkan dalam lapisan yang berbeda, tidak boleh bercampur. Class-class yang digunakan
 * untuk mengakses database tidak boleh bocor ke lapisan UI dan sebaliknya class-class UI tidak
 * boleh sampai merembes ke class untuk mengakses database. Nah, kalau misalnya class yang
 * mengakses database ingin melempar exception ke class UI, maka kita harus membuat class
 * exception sendiri dan class inilah yang akan kita lempar ke class UI.
 */
