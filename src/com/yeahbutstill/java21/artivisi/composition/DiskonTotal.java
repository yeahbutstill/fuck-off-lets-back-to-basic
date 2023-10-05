package com.yeahbutstill.java21.artivisi.composition;

import java.math.BigDecimal;

public class DiskonTotal implements Diskon {
  @Override
  public String getNama() {
    return "Diskon Total";
  }

  @Override
  public BigDecimal hitungDiskon(Transaksi t) {
    if (t.hitungTotalNilai().compareTo(new BigDecimal(1_000_000)) > 0) {
      return t.hitungTotalNilai().multiply(new BigDecimal(0.05));
    }
    return null;
  }
}
