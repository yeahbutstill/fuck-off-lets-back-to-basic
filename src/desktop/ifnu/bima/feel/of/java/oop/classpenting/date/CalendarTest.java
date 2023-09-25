package desktop.ifnu.bima.feel.of.java.oop.classpenting.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
  public static void main(String[] args) {
    /**
     * Class Calendar mempunyai method setTime untuk memasukkan object class Date ke dalam calendar,
     * kemudian bisa dilakukan perhitungan dan setelah selesai object date bisa dikeluarkan dari
     * calendar dengan menggunakan method getTime. Untuk mendapatkan nilai individual dari waktu,
     * class Calendar menyediakan method get dengan sebuah parameter yang menerangkan bagian apa
     * dari calendar yang ingin diambil. Contohnya seperti di bawah ini :
     */
    Calendar instance = Calendar.getInstance();
    System.out.println(instance);
    int tahun = instance.get(Calendar.YEAR);
    int bulan = instance.get(Calendar.MONTH);
    int tanggal = instance.get(Calendar.DATE);
    int hari = instance.get(Calendar.DAY_OF_WEEK);

    System.out.println(tahun);
    System.out.println(bulan);
    System.out.println(tanggal);
    System.out.println(hari);

    /**
     * Perlu diperhatikan bahwa nilai bulan yang diambil dari calender dimulai dari 0 hingga 11!!,
     * berbeda dengan tanggal yang tidak ada nilai 0, perilaku ini kerap menimbulkan bug di dalam
     * aplikasi karena anggapan umum bulan dimulai dari 1 hingga 12.
     */

    /**
     * Method add dari class Calendar digunakan untuk menambahkan satuan waktu ke dalam calendar.
     * Parameternya ada dua: satuan waktu dan berapa banyak nilai yang akan ditambahkan. Perhatikan
     * contoh di bawah ini :
     */
    Calendar instance1 = Calendar.getInstance();
    instance1.add(Calendar.DATE, 1); // menambah satu hari
    instance1.add(Calendar.HOUR, 1); // menambah satu jam
    instance1.add(Calendar.YEAR, -1); // mengurangi satu tahun
    instance1.add(Calendar.MONTH, 1);
    /**
     * Proses penambahan atau pengurangan menggunakan add akan merubah satuan waktu lebih besar.
     * Misalnya sekarang tanggal 31 januari dan ditambah satu hari, maka hasilnya adalah 1 Februari.
     * Kalau kita tidak ingin satuan waktu lebih besar ikut berubah karena proses
     * penambahan/pengurangan gunakan method roll, seperti contoh di bawah ini:
     */
    GregorianCalendar gregorianCalendar = new GregorianCalendar(2023, Calendar.JANUARY, 31);
    gregorianCalendar.roll(Calendar.DATE, 1); // hasilnya 1 januari 2023 bukan 1 febuari 2023
    /**
     * Contoh di atas, kita menambah satu hari ke tanggal 31 Januari 2023, karena method yang
     * digunakan adalah roll dan 31 adalah tanggal terbesar untuk bulan januari maka tanggalnya
     * akan dimulai lagi menjadi 1 tetapi bulannya tidak berubah, tetap januari.
     */
    System.out.println();
    System.out.println(gregorianCalendar);
  }
}
