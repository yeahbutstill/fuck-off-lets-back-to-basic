package desktop.ifnu.bima.feel.of.java.oop.classpenting.jodatime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculateDateTest {
  public static void main(String[] args) {
    /**
     * Contoh pertama: membuat instant, tambahkan 20 hari kemudian print hasilnya ke dalam
     * console dengan format tanggal tertentu. Kode untuk melakukan perhitungan tersebut dengan
     * menggunakan class-class dari JDK adalah seperti berikut ini :
     */
    Calendar c = Calendar.getInstance();
    c.set(2000, Calendar.SEPTEMBER, 22, 1, 0, 0);
    c.add(Calendar.DATE, 20);
    SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
    System.out.println("Date: " + format.format(c.getTime()));
  }
}
