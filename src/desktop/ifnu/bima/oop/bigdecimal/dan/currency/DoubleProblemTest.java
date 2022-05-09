package desktop.ifnu.bima.oop.bigdecimal.dan.currency;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Selain masalah pembulatan, tipe data double juga mempunyai masalah serius dengan
 * representasinya di dalam memory. Tidak semua angka dibelakang koma bisa direpresentasikan
 * dalam binary, misalnya angka 0.035, kalau angka ini disimpan dalam tipe data double maka
 * hasilnya adalah 0.034999999999999996. Masalah representasi data di belakang koma ini tidak
 * muncul di BigDecimal, sehingga bisa dihindari masalah seperti ini.
 * Mari kita lihat contoh masalah ini dalam kode :
 */

public class DoubleProblemTest {

    public static void main(String[] args) {

        Double dd = .35;
        BigDecimal d = new BigDecimal(dd);
        System.out.println(".35 = " + d); // hasilnya berantakan karena dari Double
        d = d.setScale(2, RoundingMode.HALF_UP);
        System.out.println(".35 = " + d); // hasilnya bagus setelah pembulatan
        BigDecimal dec = new BigDecimal("0.35");
        System.out.println(".35 = " + dec); // hasilnya bagus

        /**
         * BigDicimal yang dibuat dari double mempunyai nilai sama persis dengan double, makanya lebih
         * baik kalau nilainya berasal dari String sehingga bisa sesuai yang kita harapkan.
         */

    }

}
