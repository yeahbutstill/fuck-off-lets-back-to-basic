package hackerrank.java.artivisi.composition;

import java.math.BigDecimal;

public class DiskonTotal implements Diskon {
    @Override
    public String getNama() {
        return "Diskon Total";
    }

    @Override
    public BigDecimal hitungDiskon(Transaksi transaksi) {
        if (transaksi.hitungTotalNilai().compareTo(new BigDecimal("1000000")) > 0) {
            return transaksi.hitungTotalNilai().multiply(new BigDecimal("0.05"));
        }
        return null;
    }
}
