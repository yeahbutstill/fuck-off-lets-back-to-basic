package com.yeahbutstill.java21.artivisi.latihan.oop;

import com.yeahbutstill.java21.artivisi.latihan.oop.service.Diskon;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public record Pembelian(
        LocalDateTime waktuTransaksi,
        Customer customer,
        List<PembelianDetail> daftarPemebelianDtl,
        List<Diskon> daftarDiskon) {

    public Pembelian(Customer c1) {
        this(LocalDateTime.now(), c1, new ArrayList<>(), new ArrayList<>());
    }

    public Pembelian(
            LocalDateTime waktuTransaksi,
            Customer customer,
            List<PembelianDetail> daftarPemebelianDtl,
            List<Diskon> daftarDiskon) {
        this.waktuTransaksi = waktuTransaksi;
        this.customer = customer;
        this.daftarPemebelianDtl = daftarPemebelianDtl;
        this.daftarDiskon = daftarDiskon;
    }

    public BigDecimal total() {
        BigDecimal nilaiTotal = BigDecimal.ZERO;
        for (PembelianDetail pembelianDetail : daftarPemebelianDtl) {
            nilaiTotal = nilaiTotal.add(pembelianDetail.subTotal());
        }

        return nilaiTotal;
    }

    public BigDecimal totalDiskon() {
        BigDecimal nilaiTotal = BigDecimal.ZERO;
        for (Diskon d : daftarDiskon) {
            nilaiTotal = nilaiTotal.add(d.hitung(this));
        }

        return nilaiTotal;
    }

    public void cetakStruk() {
        System.out.println("Waktu transaksi : " + waktuTransaksi.toString());
        System.out.println("=============================================");

        for (PembelianDetail pd : daftarPemebelianDtl) {
            System.out.println(pd.produk().name());
            System.out.print("      " + pd.jumlah() + "    x    " + pd.produk().price());
            System.out.println("      : " + pd.subTotal());
            System.out.println();
        }

        System.out.println("=============================================");

        for (Diskon d : daftarDiskon) {
            System.out.println(d.getClass().getSimpleName() + " : " + d.hitung(this));
        }

        System.out.println("================================================");
        System.out.println("Total           :" + total().setScale(2, RoundingMode.HALF_EVEN));
        System.out.println("Total Diskon    :" + totalDiskon());
        System.out.println("Total Pembayaran:" + total().subtract(totalDiskon()));
    }
}
