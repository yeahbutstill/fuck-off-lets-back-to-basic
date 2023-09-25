package desktop.ifnu.bima.feel.of.java.oop.classpenting.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(now));

    String tanggal = "25/09/2023 04:50:40";
    try {
      Date date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(tanggal);
      System.out.println(new SimpleDateFormat("dd MMMM yyyy").format(date));
    } catch (ParseException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
/**
 * Manipulasi tanggal menggunakan Calendar dan memformat tanggal menggunakan
 * SimpleDateFormat terkadang memerlukan kode yang cukup panjang dan tidak praktis. Masalah
 * kurang handalnya library pengolahan tanggal yang ada dalam JDK sudah banyak diketahui, di JDK
 * 7 nanti akan ada library tanggal yang baru di JSR-310. library ini diturunkan dari library tanggal
 * yang sangat populer dan powerfull, yaitu Joda Time. Di bab berikutnya kita akan membandingkan
 * bagaimana mengolah data menggunakan Calendar vs menggunakan Joda Time.
 */
