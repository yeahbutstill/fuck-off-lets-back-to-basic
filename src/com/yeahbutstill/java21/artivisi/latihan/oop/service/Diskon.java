package com.yeahbutstill.java21.artivisi.latihan.oop.service;

import com.yeahbutstill.java21.artivisi.latihan.oop.Pembelian;
import java.math.BigDecimal;

public interface Diskon {
    BigDecimal hitung(Pembelian p);
}
