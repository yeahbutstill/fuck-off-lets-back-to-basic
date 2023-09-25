package desktop.ifnu.bima.feel.of.java.oop.classpenting.jodatime;

import org.joda.time.DateTime;
import org.joda.time.Interval;

public class IntervalTest {
  public static void main(String[] args) {
    /**
     * Interval adalah representasi jarak antara satu instant dengan intant yang lainya. Konsep
     * interval mempunyai dua buah instant yaitu waktu mulai dan waktu selesai. Class Interval
     * digunakan untuk merepresentasikan konsep interval ini. Method getStart dari class Interval
     * digunakan untuk mendapatkan waktu mulai, sedangkan method getEnd digunakan untuk mendapatkan
     * waktu selesai. Kalau ingin mengubah waktu awal gunakan method withStart dan kalau ingin
     * mengubah waktu akhir gunakan method withEnd.
     */
    DateTime now = new DateTime();
    DateTime oneMonthsLater = now.plusMonths(1);
    Interval interval = new Interval(now, oneMonthsLater);
    // Kalau anda bekerja dengan windows, jangan lupa mengganti pemisah classpath dengan
    // simbol ; (titik koma).
    System.out.println("Interval: " + interval);
    System.out.println("Start: " + interval.getStart());
    System.out.println("End: " + interval.getEnd());
    System.out.println("duration: " + interval.toDuration());
    // merubah nilai end interval dengan menambahkan satu jam
    interval.withEnd(interval.getEnd().plusHours(1));
  }
}
