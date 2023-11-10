package com.zamannow.stdclass;

import java.math.BigDecimal;
import java.util.Objects;

public class TestObjects {
    public static void main(String[] args) {
        Produk p1 = new Produk();
        p1.setNama("Macbook Pro M666");
        p1.setHarga(new BigDecimal(30_000_000));

        Produk p2 = new Produk();
        p2.setNama("Asus A15");
        p2.setHarga(new BigDecimal(20_000_000));

        Produk p3 = null;

        // tidak aman
//        System.out.println(p3);
//        System.out.println(p3.hashCode());
//        System.out.println(p3.equals(p2));

        // kode tanpa Objects class
        if (p1 != null) {
            System.out.println(p1);
        }

        if (p1 != null) {
            System.out.println(p1.hashCode());
        }

        if (p1 != null) {
            System.out.println(p1.equals(p2));
        }

        System.out.println("---------------------------");

        // kode dengan Objects class
        String string = Objects.toString(p2);
        String hashCode = String.valueOf(Objects.hashCode(p2));
        String equals = String.valueOf(Objects.equals(p2, p1));
        System.out.println(string);
        System.out.println(hashCode);
        System.out.println(equals);
    }

    static class Produk {
        private String nama;
        private BigDecimal harga;

        public Produk() {
        }

        public Produk(String nama, BigDecimal harga) {
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
            if (o == null || getClass() != o.getClass()) return false;
            Produk produk = (Produk) o;
            return Objects.equals(nama, produk.nama) && Objects.equals(harga, produk.harga);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nama, harga);
        }

        @Override
        public String toString() {
            return "Produk{" + "nama='" + nama + '\'' + ", harga=" + harga + '}';
        }
    }
}
