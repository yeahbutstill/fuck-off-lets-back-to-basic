package com.artivisi.training.bestpractices.composition;

import java.math.BigDecimal;

public class DiskonTotal implements Diskon {

    @Override
    public String getNama() {
        return "Diskon Total";
    }

    @Override
    public BigDecimal hitungDiskon(TransaksiDenganComposition t) {
        if (t.hitungTotalNilai().compareTo(new BigDecimal("1000000")) > 0) {
            return t.hitungTotalNilai().multiply(new BigDecimal("0.05"));
        }
        return null;
    }
}
