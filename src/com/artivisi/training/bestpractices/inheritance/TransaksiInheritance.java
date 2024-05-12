package com.artivisi.training.bestpractices.inheritance;

import com.artivisi.training.bestpractices.serializable.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// super class
public class TransaksiInheritance {
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

    @Override
    public String toString() {
        return "Transaksi{" +
                "referensi='" + referensi + '\'' +
                ", waktuTransaksi=" + waktuTransaksi +
                ", nilai=" + nilai +
                ", daftarPembelian=" + daftarPembelian +
                '}';
    }
}
