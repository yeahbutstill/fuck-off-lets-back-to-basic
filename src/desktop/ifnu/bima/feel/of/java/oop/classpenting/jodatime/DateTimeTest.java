package desktop.ifnu.bima.feel.of.java.oop.classpenting.jodatime;

import org.joda.time.DateTime;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeTest {
  public static void main(String[] args) {
    /**
     * Class DateTime juga merepresentasikan konsep Instant. Class ini fungsinya menggabungkan
     * fungsi dalam class Date plus class Calender, karena bisa digunakan sebagai representasi waktu
     * sekaligus mempunyai method-method untuk melakukan manipulasi data waktu. Berikut ini adalah
     * contoh penggunaan class DateTime :d
     */
    DateTime dateTime = new DateTime(); // waktu sekarang
    int dayOfMonth = dateTime.getDayOfMonth();
    int monthOfYear = dateTime.getMonthOfYear(); // dimulai dari 1 hingga 12
    int year = dateTime.getYear();
    DateTime plusMonths = dateTime.plusMonths(2);
    DateTime plushMinuTime = dateTime.plusMinutes(2);
    Date d = plusMonths.toDate(); // mengubah DateTime ke Date
    GregorianCalendar gregorianCalendar = plushMinuTime.toGregorianCalendar(); // mengubah DateTime ke Calendar

    System.out.println(dateTime);
    System.out.println(dayOfMonth);
    System.out.println(monthOfYear);
    System.out.println(year);
    System.out.println(plusMonths);
    System.out.println(plushMinuTime);
    System.out.println(d);
    System.out.println(gregorianCalendar);
  }
}
