package com.artivisi.training.bestpractices.inheritance;

import com.artivisi.training.bestpractices.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private String referensi;
    private LocalDateTime waktuTransaksi;
    private BigDecimal nilai;

    private List<Product> daftarPembelian = new ArrayList<>();

    public BigDecimal hitungTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product p : daftarPembelian) {
            total = total.add(p.getPrice());
        }
        return total;
    }
}
