package desktop.ifnu.bima.oop.joda.time;


import org.joda.time.DateTime;
import org.joda.time.Duration;

/**
 * Konsep durasi dalam Joda Time merepresentasikan lama waktu dalam mili detik. Durasi bisa
 * dihitung langsung dengan memasukkan nilai durasi dalam mili detik atau bisa juga dihitung
 * dari sebuah interval. Contoh kode penggunaan durasi seperti di bawah ini :
 */
public class DurationTest {

    public static void main(String[] args) {

        Duration duration = new Duration(10000); // 10 detik
        System.out.println("duration : " + duration);

        DateTime now = new DateTime();
        DateTime oneMonthLater = now.plusMonths(1);
        duration = new Duration(now, oneMonthLater);
        System.out.println("Duration of one month " + duration);

        Duration oneHour = new Duration(1000 * 60 * 60);
        DateTime oneHourLater = now.plus(oneHour);
        System.out.println("One hour later : " + oneHourLater);

    }

}
