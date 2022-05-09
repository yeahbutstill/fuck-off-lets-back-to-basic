package desktop.ifnu.bima.oop.joda.time;

import org.joda.time.DateTime;

/**
 * Implementasinya menggunakan Joda Time memerlukan jumlah baris kode setengahnya dari
 * kode di atas :
 */
public class CalculateDateJodaTest {

    public static void main(String[] args) {

        DateTime dateTime = new DateTime(2022, 1, 1, 0, 0, 0, 0);
        System.out.println("Date : " + dateTime.plusDays(20).toString("dd MMM yyyy HH:mm:ss"));

    }

}
