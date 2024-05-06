package com.artivisi.training.bestpractices.functional;

import com.artivisi.training.bestpractices.serializable.Product;

import java.math.BigDecimal;

public class FunctionalDemo1 {
    public static void main(String[] args) {
        Transaksi t = new Transaksi();

        // sintaks 1 : arg -> expr
        t.getDaftarDiskon().add(tx -> new BigDecimal(0));

        // sintaks 2 : arg -> { statemen + return }
        t.getDaftarDiskon().add(tx -> {
            return BigDecimal.ZERO;
        });

        t.getDaftarDiskon().add(tx -> {
            if (tx.hitungTotalNilai().compareTo(new BigDecimal("1000000")) > 0) {
                return tx.hitungTotalNilai().multiply(new BigDecimal("0.05"));
            }
            return BigDecimal.ZERO;
        });

        Product p = new Product();
        p.setCode("P001");
        p.setPrice(new BigDecimal(2000000));

        t.getDaftarPembelian().add(p);
        System.out.println("Total nilai : " + t.hitungTotalNilai());
        System.out.println("Yang harus dibayar : " + t.hitungTotalPembayaran());
    }
}
