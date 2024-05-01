package com.artivisi.training.bestpractices.functional;

import com.artivisi.training.bestpractices.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Pembelian {
    private List<Product> daftarPembelian = new ArrayList<>();

    private List<Function<Pembelian, BigDecimal>> daftarPerubahanHarga
            = new ArrayList<>();

    public List<Function<Pembelian, BigDecimal>> getDaftarPerubahanHarga() {
        return daftarPerubahanHarga;
    }

    public List<Product> getDaftarPembelian() {
        return daftarPembelian;
    }

    public BigDecimal hitungTotalNilai() {
        return daftarPembelian
                .stream()
                .map(product -> product.getPrice())
                .reduce(BigDecimal::add)
                .get();
    }

    public BigDecimal hitungTotalPerubahan() {
        return daftarPerubahanHarga
                .stream()
                .map(p -> p.apply(this))
                .reduce(BigDecimal::add)
                .get();
    }

    public BigDecimal hitungTotalPembayaran() {
        return hitungTotalNilai().add(hitungTotalPerubahan());
    }
}
