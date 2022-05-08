package desktop.ifnu.bima.oop.date.calendar.dateformat;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1); // menambahkan satu hari
        calendar.add(Calendar.HOUR, 1); // menambahkan satu jam
        calendar.add(Calendar.YEAR, -1); // mengurangi satu tahun
        System.out.println(calendar);

        // Proses penambahan atau pengurangan menggunakan add akan merubah satuan waktu lebih
        //besar. Misalnya sekarang tanggal 31 januari dan ditambah satu hari, maka hasilnya adalah 1
        //Februari. Kalau kita tidak ingin satuan waktu lebih besar ikut berubah karena proses
        //penambahan/pengurangan gunakan method roll, seperti contoh di bawah ini:
        Calendar calendar1 = new GregorianCalendar(2022, Calendar.JANUARY, 31, 0, 0, 0);
        calendar1.roll(Calendar.DATE, 1); // hasilnya 1 januari 2022 bukan 1 febuari 2022
        System.out.println(calendar1);

        // Contoh di atas, kita menambah satu hari ke tanggal 31 Januari 2022, karena method yang digunakan adalah roll dan 31 adalah tanggal terbesar untuk bulan januari maka tanggalnya
        //akan dimulai lagi menjadi 1 tetapi bulannya tidak berubah, tetap januari.

    }

}
