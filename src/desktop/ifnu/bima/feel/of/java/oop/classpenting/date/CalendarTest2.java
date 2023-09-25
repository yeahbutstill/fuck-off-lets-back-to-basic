package desktop.ifnu.bima.feel.of.java.oop.classpenting.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest2 {
  public static void main(String[] args) {
    /**
     * Class Calendar juga mempunyai beberapa method lain yang cukup berguna, misalnya method
     * getActualMaximum yang bisa digunakan untuk mengambil nilai maximum satuan waktu, kalau
     * parameter dari getActualMaximum ini adalah Calendar.DAY_OF_MONTH maka akan direturn
     * nilai tanggal terbesar dari bulan tersebut. Kalau Calendarnya mempunyai tanggal 1 Februari
     * 2000 maka hasik dari getActualMaximum(Calendar.DAY_OF_MONTH) adalah 29. Contohnya
     * seperti di bawah ini
     */
    GregorianCalendar gregorianCalendar = new GregorianCalendar(2023, Calendar.SEPTEMBER, 25);
    int maxSep = gregorianCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    System.out.println(maxSep);
  }
}
