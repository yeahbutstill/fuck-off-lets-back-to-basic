package desktop.ifnu.bima.feel.of.java.flow.exception;

public class RuntimeExceptionTest {
  public static void main(String[] args) {
    int i = Integer.parseInt("abc");
    System.out.println("kode setelah exception");
    /**
     * Kode di atas akan menyebabkan RuntimeException karena berusaha mengubah string "abc” menjadi
     * angka. Perhatikan bahwa tidak wajib ada statement try-catch untuk menghandle
     * RuntimeException. Tanpa ada try-catch dalam kode di atas, maka kalau terjadi exception kode
     * akan segera keluar dari method, nah karena ini adalah method main dan tidak ada lagi method
     * yang lain (ingat analogi call stack dengan gedung tinggi), aplikasi akan langsung keluar, dan
     * string “kode setelah exception tidak akan ditampilkan”.
     */
  }
}
