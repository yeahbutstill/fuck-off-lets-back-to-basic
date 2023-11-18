package com.yeahbutstill.java21.artivisi.latihan.oop;

import com.yeahbutstill.java21.artivisi.latihan.oop.service.impl.DiskonPeriode;
import com.yeahbutstill.java21.artivisi.latihan.oop.service.impl.DiskonTotal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class DemoOOP {
    public static void main(String[] args) {
        var p1 = new Produk("P-001", "Laptop Asus", new BigDecimal(10_000_000));
        var p2 = new Produk("P-002", "Laptop Lenovo", new BigDecimal(7_000_000));
        var p3 = new Produk("P-003", "Laptop HP", new BigDecimal(7_100_000));

        var c1 = new Customer("Dani", "yeahbut@still.com");
        var pem = new Pembelian(c1);
        var pd1 = new PembelianDetail(pem, p1, 1);
        var pd2 = new PembelianDetail(pem, p2, 1);
        var pd3 = new PembelianDetail(pem, p3, 1);
        pem.daftarPemebelianDtl().addAll(List.of(pd1, pd2, pd3));

        var d1 = new DiskonTotal();
        d1.setPersentase(new BigDecimal("0.1"));
        d1.setPembelianMinimal(new BigDecimal(15_000_000));
        pem.daftarDiskon().add(d1);

        var d2 =
                new DiskonPeriode(
                        new BigDecimal("0.5"), LocalDate.of(2023, 10, 4), LocalDate.of(2023, 10, 9));
        pem.daftarDiskon().add(d2);
        pem.cetakStruk();
    }
}
