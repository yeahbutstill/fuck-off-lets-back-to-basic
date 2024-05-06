package com.artivisi.training.bestpractices.composition;

import java.math.BigDecimal;

public class DiskonPajakPpn implements Diskon, Pajak {

    @Override
    public String getNama() {
        return null;
    }

    @Override
    public BigDecimal hitungDiskon(TransaksiDenganComposition t) {
        return null;
    }

    @Override
    public BigDecimal hitungPajak(TransaksiDenganComposition t) {
        return null;
    }
}
