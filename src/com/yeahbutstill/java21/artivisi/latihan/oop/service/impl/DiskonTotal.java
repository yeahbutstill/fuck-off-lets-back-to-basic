package com.yeahbutstill.java21.artivisi.latihan.oop.service.impl;

import com.yeahbutstill.java21.artivisi.latihan.oop.Pembelian;
import com.yeahbutstill.java21.artivisi.latihan.oop.service.Diskon;

import java.math.BigDecimal;

public class DiskonTotal implements Diskon {
    private BigDecimal pembelianMinimal; // nilainya null, maka harus diisi dengan setter
    private BigDecimal persentase;

    public BigDecimal getPembelianMinimal() {
        return pembelianMinimal;
    }

    public void setPembelianMinimal(BigDecimal pembelianMinimal) {
        this.pembelianMinimal = pembelianMinimal;
    }

    public BigDecimal getPersentase() {
        return persentase;
    }

    public void setPersentase(BigDecimal persentase) {
        this.persentase = persentase;
    }

    /**
     * @param p
     * @return
     */
    @Override
    public BigDecimal hitung(Pembelian p) {
        BigDecimal diskon = BigDecimal.ZERO;

        // kalau total < atau = batas minimal, tidak dapat diskon
        if (p.total().compareTo(pembelianMinimal) < 1) {
            return diskon;
        }

        return p.total().multiply(persentase);
    }
}
