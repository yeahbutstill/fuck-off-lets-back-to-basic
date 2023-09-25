package desktop.ifnu.bima.feel.of.java.oop.classpenting.jodatime;

import org.joda.time.Instant;

public class InstantTest {
  public static void main(String[] args) {
    /**
     * Instant adalah konsep paling sederhana, konsep ini sama dengan class Date, yaitu representasi
     * jumlah mili detik dari tanggal 1 januari 1970 00:00:00 hingga sekarang. Joda Time mempunyai
     * beberapa class yang digunakan untuk merepresentasikan instant ini, dua class yang sering
     * digunakan adalah class Instant dan class DateTime. Class Instant berisi satu buah property
     * dalam mili detik, perhatikan contoh berikut ini untuk memahami class Instant :
     */
    Instant instant = new Instant(1000); // 1 detik setelah 1970
    // ingat bahwa instant mutable, sehingga perlu diset lagi setelah diubah nilainya
    instant = instant.plus(100); // ditambah 100 milidetik
    instant = instant.plus(60000); // ditambah satu menit
    System.out.println(instant);
  }
}
