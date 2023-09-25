package desktop.ifnu.bima.feel.of.java.oop.classpenting.jodatime;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import java.util.Date;

public class DurationTest {
  public static void main(String[] args) {
    /**
     * Konsep durasi dalam Joda Time merepresentasikan lama waktu dalam mili detik. Durasi bisa
     * dihitung langsung dengan memasukkan nilai durasi dalam mili detik atau bisa juga dihitung
     * dari sebuah interval. Contoh kode penggunaan durasi seperti di bawah ini :
     */
    Duration duration = new Duration(10_000); // 10 detik
    System.out.println("Duration: " + duration);

    DateTime dateTimeNow = new DateTime();
    DateTime oneMonthsLater = dateTimeNow.plusMonths(1);
    duration = new Duration(dateTimeNow, oneMonthsLater);
    System.out.println("Duration of one month: " + duration);

    Duration oneHours = new Duration((1_000 * 60) * 60);
    DateTime oneHoursLater = dateTimeNow.plus(oneHours);
    System.out.println("One hours later: " + oneHoursLater);
    // Kalau anda bekerja dengan windows, jangan lupa mengganti pemisah classpath dengan simbil ;
    // (titik koma).
  }
}
