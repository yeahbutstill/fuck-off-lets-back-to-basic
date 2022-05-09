package desktop.ifnu.bima.oop.joda.time;

import org.joda.time.DateTime;

/**
 * Contoh kedua sedikit lebih rumit, misalnya kita ingin mengetahui hasil perhitungan ini :
 * tanggal awal adalah 1 januari 2000, tambahkan 1 bulan 45 hari dari tanggal awal, kemudian
 * cari tanggal berapa di hari minggu pada minggu tersebut. Perhitungan ini cukup rumit untuk
 * dibuat implementasinya menggunakan library JDK, tetapi menggunakan Joda Time
 * perhitungan ini sangat sederhana dan hanya memerlukan beberapa baris kode saja.
 * Implementasinya :
 */
public class CalculateComplicatedDateJodaTest {

    public static void main(String[] args) {

        DateTime dateTime = new DateTime(2022, 1, 1, 0, 0, 0, 0);
        System.out.println("Date : " + dateTime.plusMonths(1).plusDays(45).dayOfWeek().withMaximumValue()
                .toString("dd MMM yyyy HH:mm:ss"));

    }

}

/**
 * Library Joda Time adalah library yang wajib ada di setiap project yang kita buat. Perhitungan
 * tanggal menjadi mudah menggunakan Joda Time.
 */
