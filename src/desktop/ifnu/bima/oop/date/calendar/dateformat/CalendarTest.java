package desktop.ifnu.bima.oop.date.calendar.dateformat;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class Calendar juga mempunyai beberapa method lain yang cukup berguna, misalnya method
 * getActualMaximum yang bisa digunakan untuk mengambil nilai maximum satuan waktu, kalau
 * parameter dari getActualMaximum ini adalah Calendar.DAY_OF_MONTH maka akan direturn
 * nilai tanggal terbesar dari bulan tersebut. Kalau Calendarnya mempunyai tanggal 1 Februari
 * 2000 maka hasik dari getActualMaximum(Calendar.DAY_OF_MONTH) adalah 29. Contohnya
 * seperti di bawah ini
 */
public class CalendarTest {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2000, Calendar.FEBRUARY, 1);
        int maxFeb = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(maxFeb);
    }

}
