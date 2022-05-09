package desktop.ifnu.bima.oop.joda.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Contoh pertama : membuat instant, tambahkan 20 hari kemudian print hasilnya ke dalam
 * console dengan format tanggal tertentu. Kode untuk melakukan perhitungan tersebut dengan
 * menggunakan class-class dari JDK adalah seperti berikut ini :
 */
public class CalculateDateTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.JANUARY, 1, 0, 0, 0);
        calendar.add(Calendar.DATE, 22);
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        System.out.println("date : " + format.format(calendar.getTime()));

    }

}
