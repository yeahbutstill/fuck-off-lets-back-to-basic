package desktop.ifnu.bima.feel.of.java.oop.classpenting.jodatime;

import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Period;

public class PeriodTest {
  public static void main(String[] args) {
    /**
     * Durasi adalah konsep komputer yang ketat, artinya durasi bisa diukur dalam mili detik dan tidak
     * terikat dengan suatu waktu tertentu. Sedangkan periode adalah sebuah konsep durasi yang
     * sedikit berbeda karena terikat dengan suatu waktu tertentu dan lebih condong sebagai
     * intepretasi manusia terhadap waktu dibanding intepretasi mesin terhadap waktu. Contoh periode
     * adalah : 1 tahun 2 bulan 30 hari, nah berapa total lama periode tersebut dalam mili detik tidaklah
     * selalu sama, tergantung dari mana awal dari periode tersebut. Misalnya 1 tahun di tahun 2000
     * dengan 1 tahun di tahun 2001 akan berbeda dalam satuan mili detik karena tahun 2000 adalah
     * tahun kabisat di penanggalan gregorian.
     *
     * Di sisi lain, periode ini lebih praktis dibanding dengan durasi, terutama kalau nilainya lumayan
     * tinggi dan didefnisikan dalam pecahan waktu. Berikut ini contoh penggunaan dari konsep
     * periode:
     */
    Period period = new Period(1_000); // 1 detik
    System.out.println("Period: " + period);

    period = new Period(2, 3, 9, 125); // 2 jam 3 menit 9 detik dan 125 mili detik
    System.out.println("period: " + period);

    DateTime startTime = new DateTime(2000, 1, 1, 9, 0, 0, 0);// 1 januari 2000 jam 9
    // menambahkan period ke instant untuk mendapatkan instant baru
    DateTime endTime = startTime.plus(period);
    System.out.println("End TIme: " + endTime);

    /**
     * Periode nilainya tidak menentu, satu hari belum tentu 24 jam,
     * tergantung apakah hari itu ada daylight saving atau tidak.
     * Begitupula satu tahun belum tentu 365 hari, tergantung kabisat atau tidak.
     * Mengubah Period ke durasi harus ada waktu awal,
     * kemudian ditambah dengan period dapat waktu akhir dan dihitung durasinya
     */
    Hours hours = Hours.hoursBetween(startTime, endTime);
    // mendapatkan durasi dalam jam dengan tipe data int
    int hourhBetween = hours.getHours();
    System.out.println("Hours duration: " + hourhBetween);

    Minutes minute = Minutes.minutesBetween(startTime, endTime);
    int minutes = minute.getMinutes();
    System.out.println("Minutes duration: " + minutes);
  }
}
