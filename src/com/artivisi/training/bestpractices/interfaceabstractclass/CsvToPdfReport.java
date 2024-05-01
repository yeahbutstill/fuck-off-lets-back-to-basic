package com.artivisi.training.bestpractices.interfaceabstractclass;

public class CsvToPdfReport extends ReportGenerator {
    @Override
    public void isiDataProduk() {
        System.out.println("Membaca file csv, isikan ke daftarProduk");
    }

    @Override
    public void generateReportFile() {
        System.out.println("Generate daftar-produk.pdf");
    }
}
