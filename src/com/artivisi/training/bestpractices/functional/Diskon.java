package com.artivisi.training.bestpractices.functional;


import java.math.BigDecimal;

@FunctionalInterface
public interface Diskon {

    default String getNama() {
        return this.getClass().getName();
    }

    BigDecimal hitungDiskon(Transaksi t);
}
