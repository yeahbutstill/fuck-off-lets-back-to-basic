package hackerrank.java.artivisi.interfaceabstractclass;

import hackerrank.java.artivisi.entity.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {

    protected BigDecimal hargaMinimun = BigDecimal.ZERO;
    protected List<Product> daftarProduct = new ArrayList<>();

    public void setHargaMinimun(BigDecimal hargaMinimun) {
        this.hargaMinimun = hargaMinimun;
    }

    public abstract void isiDataProduct();

    public abstract void generateReportFile();

    public final void buatReport() {
        isiDataProduct();
        filterProduct();
        generateReportFile();
    }

    private void filterProduct() {
        System.out.println("Membuat product yang dibawah harga minimum " + hargaMinimun);
        for (Product product : daftarProduct) {
            if (product.getPrice().compareTo(hargaMinimun) < 0) {
                daftarProduct.remove(product);
            }
        }
    }

}
