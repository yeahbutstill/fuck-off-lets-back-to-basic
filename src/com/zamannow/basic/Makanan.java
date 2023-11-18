package com.zamannow.basic;

import java.math.BigDecimal;

public class Makanan {
    private String nama;
    private BigDecimal harga;

    public Makanan() {
    }

    public Makanan(String nama, BigDecimal harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Makanan makanan)) return false;

        if (getNama() != null ? !getNama().equals(makanan.getNama()) : makanan.getNama() != null)
            return false;
        return getHarga() != null ? getHarga().equals(makanan.getHarga()) : makanan.getHarga() == null;
    }

    @Override
    public int hashCode() {
        int result = getNama() != null ? getNama().hashCode() : 0;
        result = 31 * result + (getHarga() != null ? getHarga().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Makanan{" + "nama='" + nama + '\'' + ", harga=" + harga + '}';
    }
}
