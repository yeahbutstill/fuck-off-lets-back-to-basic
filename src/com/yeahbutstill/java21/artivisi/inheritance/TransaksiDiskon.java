package com.yeahbutstill.java21.artivisi.inheritance;

import java.math.BigDecimal;

public class TransaksiDiskon extends Transaksi {
  private BigDecimal diskon;

  public BigDecimal totalDibayar() {
    return hitungTotal().subtract(diskon);
  }
}
