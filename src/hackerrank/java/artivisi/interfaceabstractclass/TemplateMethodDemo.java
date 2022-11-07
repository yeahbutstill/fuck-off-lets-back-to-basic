package hackerrank.java.artivisi.interfaceabstractclass;

import java.math.BigDecimal;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        DatabaseToExcelReport databaseToExcelReport = new DatabaseToExcelReport();
        databaseToExcelReport.setHargaMinimun(new BigDecimal("10000"));
        databaseToExcelReport.buatReport();

        CsvToPdfReport csvToPdfReport = new CsvToPdfReport();
        csvToPdfReport.setHargaMinimun(new BigDecimal("15000"));
        csvToPdfReport.buatReport();

    }
}
