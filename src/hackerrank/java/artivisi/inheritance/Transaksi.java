package hackerrank.java.artivisi.inheritance;

import hackerrank.java.artivisi.entity.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaksi {

    private String referensi;
    private LocalDateTime waktuTransaksi;
    private BigDecimal nilai;
    private List<Product> daftarPembelian = new ArrayList<>();

    public BigDecimal hitungTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : daftarPembelian) {
            total = total.add(product.getPrice());
        }

        return total;
    }
}
