package com.yeahbutstill.java21.artivisi.interfaceabstractclass;

public class CsvToPdfReport extends ReportGenerator{
    @Override
    void isiDataProduct() {
        System.out.println("Membaca file csv, isikan ke daftarProduct");
    }

    @Override
    void generateReportFile() {
        System.out.println("Generate daftar-product.pdf");
    }
}
