package hackerrank.java.artivisi.composition;

import hackerrank.java.artivisi.entity.Product;

import java.math.BigDecimal;

public class DiskonProduct implements Diskon {

    @Override
    public String getNama() {
        return "Diskon Product";
    }

    @Override
    public BigDecimal hitungDiskon(Transaksi transaksi) {
        BigDecimal totalDiskon = BigDecimal.ZERO;
        for (Product product : transaksi.getDaftarPembelian()) {
            if ("P001".equalsIgnoreCase(product.getCode())) {
                totalDiskon.add(product.getPrice().multiply(new BigDecimal("0.1")));
            }
        }
        return totalDiskon;
    }

}
