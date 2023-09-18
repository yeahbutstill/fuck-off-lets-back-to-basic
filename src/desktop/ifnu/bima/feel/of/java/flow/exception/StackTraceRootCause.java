package desktop.ifnu.bima.feel.of.java.flow.exception;

public class StackTraceRootCause {
  public static void main(String[] args) {
    StackTraceRootCause stackTraceRootCause = new StackTraceRootCause();
    stackTraceRootCause.methodPertama();
    System.out.println("kode ini tidak akan dieksekusi " + "karena program sudah keluar" +
            " ketika exception di methodKelima tidak ditangkap");
  }

  /**
   * Kita lihat kode di atas, terdapat enam buah method: methodPertama sampai methodKelima dan
   * method main. Method main akan memanggil methodPertama, methodPertama akan memanggil
   * methodKedua dan seterusnya hingga pada akhirnya methodKelima sengaja dibuat agar melempar
   * NullPounterException tanpa satupun method sebelumnya menangkapnya.
   */
  public void methodPertama() {
    System.out.println("method pertama dipanggil");
    methodKedua();
  }

  public void methodKedua() {
    System.out.println("method ke dua dipanggil");
    methodKeTiga();
  }

  public void methodKeTiga() {
    System.out.println("method ke tiga dipanggil");
    methodKeEmpat();
  }

  public void methodKeEmpat() {
    System.out.println("method ke empat dipanggil");
    methodKeLima();
  }

  public void methodKeLima() {
    System.out.println("method ke lima dipanggil");
    String abc = null;
    abc.toString(); // kode ini akan menyebabkan NullPointerException
  }
}

/**
 * Method main sebagai fondasi dari call stack adalah method pertama yang dipanggil,
 * berikutnya methodPertama hingga methodKelima. Di dalam methodKelima terjadi exception
 * yang tidak ditangkap oleh method di bawahnya sehingga aplikasi keluar.
 */
