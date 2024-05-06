package com.artivisi.training.bestpractices.composition;

import java.math.BigDecimal;

public interface Diskon {
    String getNama();

    BigDecimal hitungDiskon(TransaksiDenganComposition t);
}
