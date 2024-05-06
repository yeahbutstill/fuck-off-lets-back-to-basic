package com.artivisi.training.bestpractices.interfaceabstractclass;

import com.artivisi.training.bestpractices.serializable.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
    protected BigDecimal hargaMinimum = BigDecimal.ZERO;
    protected List<Product> daftarProduk = new ArrayList<>();

    public void setHargaMinimum(BigDecimal hargaMinimum) {
        this.hargaMinimum = hargaMinimum;
    }

    public abstract void isiDataProduk();

    public abstract void generateReportFile();

    public final void buatReport() {
        isiDataProduk();
        filterProduk();
        generateReportFile();
    }

    private void filterProduk() {
        System.out.println("Membuang produk yang dibawah harga minimum : " + hargaMinimum);
        for (Product p : daftarProduk) {
            if (p.getPrice().compareTo(hargaMinimum) < 0) {
                daftarProduk.remove(p);
            }
        }
    }

}
