package desktop.ifnu.bima.feel.of.java.oop.classpenting.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Sample {
  public static void main(String[] args) {
    /**
     * Waktu dalam perhitungan komputer direpresentasikan sebagai bilangan Long yang merupakan
     * durasi antara tanggal 1 januari 1970 00:00:000 hingga waktu sekarang dalam mili detik.
     * Pencatatan tanggal ini disimpan dalam BIOS dari PC. Dari kode java kita bisa mendapatkan
     * waktu sekarang menggunakan kode :
     */
    Long waktuSekarang = System.currentTimeMillis();
    Date d = new Date(waktuSekarang);
    int tahun = d.getYear();
    int bulan = d.getMonth();
    int tanggal = d.getDate();
    Long waktuSekaranglagi = d.getTime();

    System.out.println(d);
    System.out.println(tahun);
    System.out.println(bulan);
    System.out.println(tanggal);
    System.out.println(waktuSekaranglagi);

    System.out.println();

    Calendar calendar = Calendar.getInstance(); // secara default penaggalan yang digunakan adalah Masehi(GregorianCalendar)
    calendar.set(2023, Calendar.SEPTEMBER, 25, 03, 33, 01);
    Date d1 = calendar.getTime();
    /**
     * Kode di atas menggunakan Calendar.getInstance() untuk mendapatkan tanggal sekarang, class
     * Calendar yang dikembalikan adalah GregorianCalendar yang merupakan implementasi
     * penanggalan Masehi. Method set mempunyai beberapa bentuk (overloading) untuk mengeset
     * nilai ke dalam calendar, bisa diset satu per satu atau diset hanya bulan-tanggal-tahun atau diset
     * semuanya secara bersamaan seperti dalam contoh di atas.
     */
    System.out.println(d1);
    System.out.println();

    /**
     * Kita juga bisa langsung membuat instance dari GregorianCalendar menggunakan constructor
     * seperti di bawah ini
     */
    GregorianCalendar gregorianCalendar = new GregorianCalendar(2023, Calendar.SEPTEMBER, 25, 03, 56, 2);
    Date d3 = gregorianCalendar.getTime();
    System.out.println(d3);
  }
}
