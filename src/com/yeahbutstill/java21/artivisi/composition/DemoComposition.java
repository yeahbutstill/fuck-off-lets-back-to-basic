package com.yeahbutstill.java21.artivisi.composition;

import com.yeahbutstill.java21.artivisi.Product;
import java.math.BigDecimal;

public class DemoComposition {
  public static void main(String[] args) {
    Transaksi t = new Transaksi();
    Product p = new Product();
    p.setCode("P001");
    p.setPrice(BigDecimal.valueOf(100_000));
    t.getDaftarPembelian().add(p);
    t.getDaftarDiskon().add(new DiskonProduct());
    t.getDaftarDiskon().add(new DiskonTotal());
    BigDecimal diskon = t.hitungTotalPembayaran();
    System.out.println(diskon);
  }
}
