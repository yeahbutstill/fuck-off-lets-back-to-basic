package com.artivisi.training.bestpractices.composition;

import com.artivisi.training.bestpractices.Product;

import java.math.BigDecimal;

public class DiskonProduk implements Diskon {

    @Override
    public String getNama() {
        return "Diskon Produk";
    }

    @Override
    public BigDecimal hitungDiskon(Transaksi t) {
        BigDecimal totalDiskon = BigDecimal.ZERO;
        for (Product p : t.getDaftarPembelian()) {
            if ("P001".equalsIgnoreCase(p.getCode())) {
                totalDiskon.add(p.getPrice().multiply(new BigDecimal("0.1")));
            }
        }
        return totalDiskon;
    }
}
