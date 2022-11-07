package hackerrank.java.artivisi.interfaceabstractclass;

public class CsvToPdfReport extends ReportGenerator {
    @Override
    public void isiDataProduct() {
        System.out.println("Membaca file csv, isikan ke daftarProduct");
    }

    @Override
    public void generateReportFile() {
        System.out.println("Generate daftar-product.pdf");
    }
}
