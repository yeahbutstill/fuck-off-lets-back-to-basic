package desktop.ifnu.bima.oop.date.calendar.dateformat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDeprecatedTest {

    public static void main(String[] args) {

        Long sekarangWaktu = System.currentTimeMillis();
        System.out.println(sekarangWaktu);

        Date date = new Date();
        int tahundeprecated = date.getYear();
        int bulandeprecated = date.getMonth();
        int tanggaldeprecated = date.getDate();
        Long sekaranWaktu1 = date.getTime();

        System.out.println("deprecated");
        System.out.println(tahundeprecated);
        System.out.println(bulandeprecated);
        System.out.println(tanggaldeprecated);
        System.out.println("================");
        System.out.println(sekaranWaktu1);

        Long waktuSekarang = System.currentTimeMillis();
        Date d = new Date(waktuSekarang);
        System.out.println(d);

        // Calendar.getInstance() untuk mendapatkan tanggal sekarang
        Calendar calendar = Calendar.getInstance(); //secara default penanggalan yang digunakan adalah Masehi(GregorianCalendar)
        calendar.set(2022, Calendar.JANUARY, 1, 0, 0, 0);
        Date time = calendar.getTime();
        System.out.println(time);

        // Kita juga bisa langsung membuat instance dari GregorianCalendar menggunakan constructor
        Calendar calendar1 = new GregorianCalendar(2022, Calendar.JANUARY, 22, 0, 0, 0);
        Date date1 = calendar1.getTime();
        System.out.println(date1);

        System.out.println("=======================");
        System.out.println("Class Calendar");
        // Class Calendar mempunyai method setTime untuk memasukkan object class Date ke dalam
        //calendar, kemudian bisa dilakukan perhitungan dan setelah selesai object date bisa dikeluarkan
        //dari calendar dengan menggunakan method getTime.
        //Untuk mendapatkan nilai individual dari waktu, class Calendar menyediakan method get dengan
        //sebuah parameter yang menerangkan bagian apa dari calendar yang ingin diambil. Contohnya
        //seperti di bawah ini :
        Calendar calendar2 = Calendar.getInstance();
        int tahun = calendar2.get(Calendar.YEAR);
        int bulan = calendar2.get(Calendar.MONTH);
        int tanggal = calendar2.get(Calendar.DATE);
        int hari = calendar2.get(Calendar.DAY_OF_WEEK);
        System.out.println(tahun);
        // Perlu diperhatikan bahwa nilai bulan yang diambil dari calender dimulai dari 0 hingga 11!!,
        //berbeda dengan tanggal yang tidak ada nilai 0, perilaku ini kerap menimbulkan bug di dalam
        //aplikasi karena anggapan umum bulan dimulai dari 1 hingga 12.
        System.out.println(bulan);
        System.out.println(tanggal);
        System.out.println(hari);

    }

}
