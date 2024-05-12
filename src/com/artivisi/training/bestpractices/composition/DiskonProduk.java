package com.artivisi.training.bestpractices.composition;

import com.artivisi.training.bestpractices.serializable.Product;

import java.math.BigDecimal;

/*
type inheritance, artinya dia cuma mewarisi yang kita butuhkan untuk diwarisi cuman type data saja,
tidak ada implementasinya
 */
public class DiskonProduk implements Diskon {

    @Override
    public String getNama() {
        return "Diskon Produk";
    }

    @Override
    public BigDecimal hitungDiskon(TransaksiDenganComposition t) {
        BigDecimal totalDiskon = BigDecimal.ZERO;
        for (Product p : t.getDaftarPembelian()) {
            if ("P001".equalsIgnoreCase(p.getCode())) {
                totalDiskon.add(p.getPrice().multiply(new BigDecimal("0.1")));
            }
        }
        return totalDiskon;
    }
}
