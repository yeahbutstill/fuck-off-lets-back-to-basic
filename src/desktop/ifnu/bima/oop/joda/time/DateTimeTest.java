package desktop.ifnu.bima.oop.joda.time;

import org.joda.time.DateTime;

import java.util.Calendar;
import java.util.Date;

/**
 * Class DateTime juga merepresentasikan konsep Instant. Class ini fungsinya menggabungkan
 * fungsi dalam class Date plus class Calender, karena bisa digunakan sebagai representasi waktu
 * sekaligus mempunyai method-method untuk melakukan manipulasi data waktu. Berikut ini adalah
 * contoh penggunaan class DateTime :
 */
public class DateTimeTest {

    public static void main(String[] args) {

        DateTime dateTime = new DateTime(); // waktu sekarang
        int date = dateTime.getDayOfMonth();
        int month = dateTime.getDayOfYear(); // dimulai dari 1 hingga 12
        int year = dateTime.getYear();

        DateTime plusMonth = dateTime.plusMonths(2);
        DateTime plusMinutes = dateTime.plusMinutes(2);
        Date d = plusMinutes.toDate(); // mengubah DateTime ke Date
        Calendar c = plusMinutes.toGregorianCalendar(); // mengubah DateTime ke Calendar

        System.out.println(dateTime);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        System.out.println("============================");

        System.out.println(plusMonth);
        System.out.println(d);
        System.out.println(c);

    }

}
