package com.yeahbutstill.java21.artivisi.interfaceabstractclass;

import com.yeahbutstill.java21.artivisi.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
    protected BigDecimal hargaMinimum = BigDecimal.ZERO; // protected supaya bisa diakses sama anaknya atau subclass
    protected List<Product> daftarProduk = new ArrayList<>();

    public BigDecimal getHargaMinimum() {
        return hargaMinimum;
    }

    public void setHargaMinimum(BigDecimal hargaMinimum) {
        this.hargaMinimum = hargaMinimum;
    }

    public List<Product> getDaftarProduk() {
        return daftarProduk;
    }

    public void setDaftarProduk(List<Product> daftarProduk) {
        this.daftarProduk = daftarProduk;
    }

    abstract void isiDataProduct();
    abstract void generateReportFile();

    public final void buatReport() {
        isiDataProduct();
        filterProduct();
        generateReportFile();
    }

    private void filterProduct() {
        System.out.println("Membuang produk yang dibawah harga minimum: " +  hargaMinimum);
        for (Product p : daftarProduk) {
            if (p.getPrice().compareTo(hargaMinimum) < 0) {
                daftarProduk.remove(p);
            }
        }
    }
}
