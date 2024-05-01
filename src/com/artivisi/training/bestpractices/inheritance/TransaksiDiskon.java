package com.artivisi.training.bestpractices.inheritance;

import java.math.BigDecimal;

public class TransaksiDiskon extends Transaksi {
    private BigDecimal diskon;

    public BigDecimal totalDibayar() {
        return hitungTotal().subtract(diskon);
    }
}
