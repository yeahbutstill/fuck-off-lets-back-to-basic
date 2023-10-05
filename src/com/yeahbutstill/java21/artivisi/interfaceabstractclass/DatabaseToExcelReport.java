package com.yeahbutstill.java21.artivisi.interfaceabstractclass;

import com.yeahbutstill.java21.artivisi.Product;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DatabaseToExcelReport extends ReportGenerator {

  private File output = new File("hasil.xls");

  @Override
  void isiDataProduct() {
    String sql = "select * from t_product";
    daftarProduk.addAll(executeSqlConvertToListProduct(sql));
  }

  private List<Product> executeSqlConvertToListProduct(String sql) {
    // connect to db
    // execute sql
    // loop ResultSet
    // convert rs to product
    // add product to list

    System.out.println("Menjalankan query: " + sql);
    return new ArrayList<>();
  }

  @Override
  void generateReportFile() {
    System.out.println("Menulis list product ke file: " + output.getName());
  }
}
