package com.artivisi.training.bestpractices.interfaceabstractclass;

import com.artivisi.training.bestpractices.Product;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DatabaseToExcelReport extends ReportGenerator {

    private File output = new File("hasil.xls");

    @Override
    public void isiDataProduk() {
        String sql = "select * from t_produk";
        daftarProduk.addAll(executeSqlConvertToListProduct(sql));
    }

    private List<Product> executeSqlConvertToListProduct(String sql) {
        // connect to db
        // execute sql
        // loop ResultSet
        // convert rs to product
        // add product to list
        System.out.println("Menjalankan query : "+sql);
        return new ArrayList<>();
    }

    @Override
    public void generateReportFile() {
        System.out.println("menulis list product ke file "+output.getName());
    }
}
