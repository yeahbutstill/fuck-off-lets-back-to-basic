package com.artivisi.training.bestpractices.composition;

import java.math.BigDecimal;

public class DiskonPajakPpn implements Diskon, Pajak {

    @Override
    public String getNama() {
        return null;
    }

    @Override
    public BigDecimal hitungDiskon(Transaksi t) {
        return null;
    }

    @Override
    public BigDecimal hitungPajak(Transaksi t) {
        return null;
    }
}
