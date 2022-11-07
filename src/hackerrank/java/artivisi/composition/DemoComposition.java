package hackerrank.java.artivisi.composition;

import hackerrank.java.artivisi.entity.Product;

import java.math.BigDecimal;

public class DemoComposition {

    public static void main(String[] args) {
        Transaksi transaksi = new Transaksi();
        Product product = new Product();
        product.setCode("P001");


        transaksi.getDaftarPembelian().add(product);
        transaksi.getDaftarDiskon().add(new DiskonProduct());
        transaksi.getDaftarDiskon().add(new DiskonTotal());

        BigDecimal diskon = transaksi.hitungTotalPembayaran();

    }

}
