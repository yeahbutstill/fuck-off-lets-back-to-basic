package desktop.ifnu.bima.classexception;

/**
 * Kalau kita jalankan kode di atas, maka setelah terjadi exception pada waktu mengeksekusi
 * method parseInt, eksekusi akan meloncat ke dalam catch, mencetak stack trace ke console
 * kemudian melanjutkan eksekusi untuk mencetak string “kode setelah exception” ke console.
 * Dengan modifkasi di atas, kode menjadi lebih handal dan tidak menyebabkan program keluar
 * sebelum eksekusi selesai semuanya.
 */

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            i = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("kode setelah exception");
    }
}
