package com.yeahbutstill.java21.artivisi.latihan.oop;

import java.math.BigDecimal;

public record PembelianDetail(Pembelian pembelian, Produk produk, Integer jumlah) {
  public BigDecimal subTotal() {
    return produk.price().multiply(new BigDecimal(jumlah));
  }
}
