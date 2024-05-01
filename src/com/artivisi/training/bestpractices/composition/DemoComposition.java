package com.artivisi.training.bestpractices.composition;

import com.artivisi.training.bestpractices.Product;

import java.math.BigDecimal;

public class DemoComposition {
    public static void main(String[] args) {
        Transaksi t = new Transaksi();
        Product p = new Product();
        p.setCode("P001");

        t.getDaftarPembelian().add(p);
        t.getDaftarDiskon().add(new DiskonProduk());
        t.getDaftarDiskon().add(new DiskonTotal());

        BigDecimal diskon = t.hitungTotalPembayaran();
    }
}
