package desktop.ifnu.bima.oop.joda.time;

import org.joda.time.LocalDate;

/**
 * Partial digunakan untuk merepresentasikan waktu yang terpisah antara tanggal dan jam tanpa
 * daerah waktu (timezone). Misalnya class LocalDate hanya mempunyai property tanggal, bulan
 * dan tahun, sedangkan class LocalTime hanya mempunyai property jam, menit, detik dan mili
 * detik. Class ini jarang digunakan dan lebih praktis menggunakan class DateTime saja untuk
 * representasi waktu, class-class tersebut ada hanya untuk tujuan backward compatibility dengan
 * versi Joda Time yang lebih lama. Contoh kodenya seperti di bawah ini :
 */

public class PartialTest {

    public static void main(String[] args) {

        LocalDate birthDay = new LocalDate(1994, 5, 15);
        Long millis = birthDay.toDateTimeAtCurrentTime().getMillis();
        System.out.println(millis); // bernilai negatif karena sebelum 1970
        birthDay = birthDay.plusYears(27); // ultah ke 27
        int year = birthDay.getYear(); // tahun ultah ke 27

        System.out.println(year);

    }

}
