package hackerrank.java.artivisi.composition;

import java.math.BigDecimal;

public interface Diskon {

    String getNama();

    BigDecimal hitungDiskon(Transaksi transaksi);
}
