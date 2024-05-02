package com.artivisi.training.bestpractices.functional;

import com.artivisi.training.bestpractices.serializable.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Transaksi {
    private String referensi = UUID.randomUUID().toString();
    private LocalDateTime waktuTransaksi = LocalDateTime.now() ;

    private List<Diskon> daftarDiskon = new ArrayList<Diskon>();
    private List<Product> daftarPembelian = new ArrayList<>();

    public List<Product> getDaftarPembelian() {
        return daftarPembelian;
    }

    public List<Diskon> getDaftarDiskon() {
        return daftarDiskon;
    }

    public BigDecimal hitungTotalNilai() {
        BigDecimal totalNilai = BigDecimal.ZERO;
        for (Product p : daftarPembelian) {
            totalNilai = totalNilai.add(p.getPrice());
        }
        return totalNilai;
    }

    public BigDecimal hitungTotalPembayaran() {


        BigDecimal totalDiskon = BigDecimal.ZERO;
        for (Diskon d : daftarDiskon) {
            totalDiskon = totalDiskon.add(d.hitungDiskon(this));
        }

        return hitungTotalNilai().subtract(totalDiskon);
    }
}
