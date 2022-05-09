package desktop.ifnu.bima.oop.joda.time;

import org.joda.time.DateTime;
import org.joda.time.Interval;

/**
 * Interval adalah representasi jarak antara satu instant dengan intant yang lainya. Konsep interval
 * mempunyai dua buah instant yaitu waktu mulai dan waktu selesai. Class Interval digunakan untukmerepresentasikan konsep interval ini. Method getStart dari class Interval digunakan untuk
 * mendapatkan waktu mulai, sedangkan method getEnd digunakan untuk mendapatkan waktu
 * selesai. Kalau ingin mengubah waktu awal gunakan method withStart dan kalau ingin
 * mengubah waktu akhir gunakan method withEnd.
 * Contoh penggunaan interval adalah sebeagai berikut ini :
 */
public class IntervalTest {

    public static void main(String[] args) {

        DateTime now = new DateTime();
        DateTime oneMonthLater = now.plusMonths(1);
        Interval interval = new Interval(now, oneMonthLater);
        System.out.println("interval : " + interval);
        System.out.println("start : " + interval.getStart());
        System.out.println("end : " + interval.getEnd());
        System.out.println("duration : " + interval.toDuration());
        // merubah nilai end interval dengan menambahkan satu jam
        interval.withEnd(interval.getEnd().plusHours(1));

    }

}
