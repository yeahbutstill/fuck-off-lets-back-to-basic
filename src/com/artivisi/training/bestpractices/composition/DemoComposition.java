package com.artivisi.training.bestpractices.composition;

import com.artivisi.training.bestpractices.serializable.Category;
import com.artivisi.training.bestpractices.serializable.Product;

import java.math.BigDecimal;

public class DemoComposition {
    public static void main(String[] args) {
        TransaksiDenganComposition t = new TransaksiDenganComposition();
        Product p = new Product();
        p.setCode("P001");
        p.setName("Mac M3");
        p.setPrice(BigDecimal.valueOf(10_000_000L));
        Category c = new Category();
        c.setCode("Apple");
        c.setName("Mac");
        p.setCategory(c);

        t.getDaftarPembelian().add(p);
        t.getDaftarDiskon().add(new DiskonProduk());
        t.getDaftarDiskon().add(new DiskonTotal());

        BigDecimal diskon = t.hitungTotalPembayaran();
        System.out.println(p);
        System.out.println(diskon);
    }
}
