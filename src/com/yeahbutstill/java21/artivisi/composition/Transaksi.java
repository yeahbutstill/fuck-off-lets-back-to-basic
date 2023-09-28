package com.yeahbutstill.java21.artivisi.composition;

import com.yeahbutstill.java21.artivisi.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Transaksi {
    private String noref = UUID.randomUUID().toString();
    private LocalDateTime waktuTransaksi = LocalDateTime.now();
    private BigDecimal nilai;
    private List<Product> daftarPembelian = new ArrayList<>();
    private List<Diskon> daftarDiskon = new ArrayList<>();

    public String getNoref() {
        return noref;
    }

    public void setNoref(String noref) {
        this.noref = noref;
    }

    public LocalDateTime getWaktuTransaksi() {
        return waktuTransaksi;
    }

    public void setWaktuTransaksi(LocalDateTime waktuTransaksi) {
        this.waktuTransaksi = waktuTransaksi;
    }

    public BigDecimal getNilai() {
        return nilai;
    }

    public void setNilai(BigDecimal nilai) {
        this.nilai = nilai;
    }

    public List<Product> getDaftarPembelian() {
        return daftarPembelian;
    }

    public void setDaftarPembelian(List<Product> daftarPembelian) {
        this.daftarPembelian = daftarPembelian;
    }

    public List<Diskon> getDaftarDiskon() {
        return daftarDiskon;
    }

    public void setDaftarDiskon(List<Diskon> daftarDiskon) {
        this.daftarDiskon = daftarDiskon;
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
