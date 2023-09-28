package com.yeahbutstill.java21.artivisi.composition;

import java.math.BigDecimal;

public interface Diskon {
    String getNama();
    BigDecimal hitungDiskon(Transaksi t);
}
