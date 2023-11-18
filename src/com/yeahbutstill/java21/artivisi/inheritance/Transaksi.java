package com.yeahbutstill.java21.artivisi.inheritance;

import com.yeahbutstill.java21.artivisi.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private String noref;
    private LocalDateTime waktuTransaksi;
    private BigDecimal nilai;
    private final List<Product> daftarPembelian = new ArrayList<>();

    public BigDecimal hitungTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product p : daftarPembelian) {
            total = total.add(p.getPrice());
        }

        return total;
    }
}
