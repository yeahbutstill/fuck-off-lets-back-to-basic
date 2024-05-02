package com.artivisi.training.bestpractices.functional;

import com.artivisi.training.bestpractices.serializable.Product;

import java.math.BigDecimal;

public class FunctionalDemo2 {
    public static void main(String[] args) {
        Pembelian p = new Pembelian();

        // diskon dari total harga
        p.getDaftarPerubahanHarga().add(pb -> {
           if(pb.hitungTotalNilai().compareTo(new BigDecimal("100000")) > 0){
               return pb.hitungTotalNilai()
                       .multiply(new BigDecimal("0.2"))
                       .negate();
           }
           return BigDecimal.ZERO;
        });

        // pajak 10% dari total

        p.getDaftarPerubahanHarga()
                .add(pb -> pb.hitungTotalNilai()
                        .multiply(new BigDecimal("0.1")));

        Product px = new Product();
        px.setCode("P001");
        px.setPrice(new BigDecimal("2000000"));

        p.getDaftarPembelian().add(px);

        System.out.println("Total nilai : "+p.hitungTotalNilai());
        System.out.println("Total perubahan harga : "+p.hitungTotalPerubahan());
        System.out.println("Total yang harus dibayar : "+p.hitungTotalPembayaran());

    }
}
