package com.yeahbutstill.java21.artivisi.latihan.oop.service.impl;

import com.yeahbutstill.java21.artivisi.latihan.oop.Pembelian;
import com.yeahbutstill.java21.artivisi.latihan.oop.service.Diskon;
import java.math.BigDecimal;
import java.time.LocalDate;

public class DiskonPeriode implements Diskon {
  private final BigDecimal persentase;
  private final LocalDate mulai;
  private final LocalDate sampai;

  public DiskonPeriode(BigDecimal persentase, LocalDate mulai, LocalDate sampai) {
    this.persentase = persentase;
    this.mulai = mulai;
    this.sampai = sampai;
  }

  /**
   * Hitung diskon dari periode
   * @param p pembelian
   * @return decimal zero
   */
  @Override
  public BigDecimal hitung(Pembelian p) {
    if (p.waktuTransaksi().toLocalDate().isAfter(mulai) &&
        p.waktuTransaksi().toLocalDate().isBefore(sampai)) {
      return p.total().multiply(persentase);
    }
      return BigDecimal.ZERO;
  }
}
