package com.artivisi.training.bestpractices.interfaceabstractclass;

import java.math.BigDecimal;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        DatabaseToExcelReport report = new DatabaseToExcelReport();
        report.setHargaMinimum(new BigDecimal("10000"));

        report.buatReport();

        CsvToPdfReport report2 = new CsvToPdfReport();
        report2.setHargaMinimum(new BigDecimal("15000"));
        report2.buatReport();
    }
}
