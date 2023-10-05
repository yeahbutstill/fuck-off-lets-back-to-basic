package com.yeahbutstill.java21.artivisi.interfaceabstractclass;

import java.math.BigDecimal;

public class TemplateMethodDemo {
  public static void main(String[] args) {
    DatabaseToExcelReport report = new DatabaseToExcelReport();
    report.setHargaMinimum(new BigDecimal(10_000));
    report.buatReport();

    System.out.println();

    CsvToPdfReport csvToPdfReport = new CsvToPdfReport();
    csvToPdfReport.setHargaMinimum(new BigDecimal(50_000));
    csvToPdfReport.buatReport();
  }
}
