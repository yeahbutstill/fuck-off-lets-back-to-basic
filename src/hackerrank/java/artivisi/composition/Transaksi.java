package hackerrank.java.artivisi.composition;

import hackerrank.java.artivisi.entity.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Transaksi {

    private String referensi = UUID.randomUUID().toString();
    private LocalDateTime waktuTransaksi = LocalDateTime.now();
    private List<Diskon> daftarDiskon = new ArrayList<>();
    private List<Product> daftarPembelian = new ArrayList<>();

    public BigDecimal hitungTotalNilai() {
        BigDecimal totalNilai = BigDecimal.ZERO;
        for (Product product : daftarPembelian) {
            totalNilai = totalNilai.add(product.getPrice());
        }

        return totalNilai;
    }

    public List<Product> getDaftarPembelian() {
        return daftarPembelian;
    }

    public List<Diskon> getDaftarDiskon() {
        return daftarDiskon;
    }

    public BigDecimal hitungTotalPembayaran() {

        BigDecimal totalDiskon = BigDecimal.ZERO;
        for (Diskon diskon : daftarDiskon) {
            totalDiskon = totalDiskon.add(diskon.hitungDiskon(this));
        }

        return hitungTotalNilai().subtract(totalDiskon);

    }
}
