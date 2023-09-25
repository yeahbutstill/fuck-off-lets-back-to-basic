package desktop.ifnu.bima.feel.of.java.oop.classpenting.jodatime;

import org.joda.time.LocalDate;

public class PartialTest {
  public static void main(String[] args) {
    /**
     * Partial digunakan untuk merepresentasikan waktu yang terpisah antara tanggal dan jam tanpa
     * daerah waktu (timezone). Misalnya class LocalDate hanya mempunyai property tanggal, bulan dan
     * tahun, sedangkan class LocalTime hanya mempunyai property jam, menit, detik dan mili detik.
     * Class ini jarang digunakan dan lebih praktis menggunakan class DateTime saja untuk
     * representasi waktu, class-class tersebut ada hanya untuk tujuan backward compatibility dengan
     * versi Joda Time yang lebih lama.
     */
    LocalDate birthDayMe = new LocalDate(1993, 9, 22);
    long millis = birthDayMe.toDateTimeAtCurrentTime().getMillis();
    System.out.println(millis);

    birthDayMe = birthDayMe.plusYears(51); // ultah ke 30
    int year = birthDayMe.getYear(); // tahun ultah ke 30
    System.out.println(year);

    LocalDate birthDaySun = new LocalDate(2024, 1, 22);
    long millisSun = birthDaySun.toDateTimeAtCurrentTime().getMillis();
    System.out.println(millisSun);

    birthDaySun = birthDaySun.plusYears(20); // ultah ke 30
    int yearSun = birthDaySun.getYear(); // tahun ultah ke 30
    System.out.println(yearSun);
  }
}
