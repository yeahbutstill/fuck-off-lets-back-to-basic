package desktop.ifnu.bima.feel.of.java.deklarasiclass.method;

import java.io.IOException;

public class TestMethod {
    /**
     * Method adalah sekumpulan kode yang diberi nama, untuk merujuk ke sekumpulan kode tersebut
     * digunakan sebuah nama yang disebut dengan nama method. Method mempunyai parameter
     * sebagai input dan nilai kembalian sebagai output. Kita bisa juga membayangkan method itu
     * adalah sebuah mesin, ada input yang dibutuhkan dan output yang dihasilkan.
     */
    public static void main(String[] args) {}
    public String methodReturnString() {
        return "ini string";
    }

    private void methodBerparameter(String param1, Integer param2) {}
    public void methodThrowException() throws IOException {}
    protected String protectedMethod(String param1, Integer param2) throws IOException {
        return "ini string";
    }
    /**
     * Nama method dan parameter adalah pembeda antara satu method dengan method yang lainya.
     * Kalau dua method namanya beda ya pasti dianggap dua buah method berbeda. Kalau dua method
     * namanya sama dianggap sebagai method yang berbeda kalau parameternya berbeda, method
     * dengan nama sama dan parameter berbeda ini disebut dengan overloading dalam konsep OOP.
     */
    public void methodBerbeda() {}
    public void methodBerbeda(String param1) {} // overloading
    public void methodBerbeda(String param1, Integer param2) {} // overloading
    public void methodBerbeda(Integer param1, String param2) {} // overloading
    public void methodBerbeda(Double parameter1, Double parameter2) {} // overloading

    /**
     * Kalau method mempunyai nama yang sama dan parameter yang sama tetapi tipe return atau
     * throws exceptionya berbeda maka akan menyebabkan error pada waktu kompilasi. Jadi kalau
     * mendefnisikan method baru, pastikan bahwa namanya tidak sama dengan method lain atau
     * setidaknya parameternya berbeda baik dari sisi jumlahnya, tipe parameter atau posisi parameter.
     */
//    public String methodBerbeda(Integer param1, String param2) throws IOException {
//        return "ini string";
//    }
}
