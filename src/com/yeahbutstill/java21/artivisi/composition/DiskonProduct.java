package com.yeahbutstill.java21.artivisi.composition;

import com.yeahbutstill.java21.artivisi.Product;
import java.math.BigDecimal;

public class DiskonProduct implements Diskon {
  @Override
  public String getNama() {
    return "Diskon Product";
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
