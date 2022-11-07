package hackerrank.java.artivisi.interfaceabstractclass;

import hackerrank.java.artivisi.entity.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DatabaseToExcelReport extends ReportGenerator {

    private File output = new File("hasil.xls");

    @Override

    public void isiDataProduct() {
        String sql = "select * from t_product";
        daftarProduct.addAll(ExecuteSqlConvertToListProduct(sql));
    }

    private List<Product> ExecuteSqlConvertToListProduct(String sql) {
        // connect to db
        // execute sql
        // loop ResultSet
        // convert rs to product
        // add product to list
        System.out.println("Menjalankan query : " + sql);
        return new ArrayList<>();
    }

    @Override
    public void generateReportFile() {
        System.out.println("Menjalankan list product ke file " + output.getName());
    }
}
