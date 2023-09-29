package com.yeahbutstill.java21.artivisi.exception;

public class DemoException {
  public static void main(
      String[]
          args) /*throws TransaksiHariLiburException*/ { // kalau di throws berarti ini dilepar lagi
    // ke pemanggil mathod ini
    TransaksiCustomer tc = new TransaksiCustomer();
    // atau handle disini, di try catch
    try {
      tc.prosesPembayaranCustomer("BCA");
    } catch (TransaksiHariLiburException e) {
      e.printStackTrace();
      // tampilkan pilihan ke user:
      // 1. Batal Transaksi
      // 2. DIjalankan di hari kerja berikut (akan dimasukan ke table antrian)
    } catch (BankOfflineException e) {
      e.printStackTrace();
      // tampilkan pilihan ke user:
      // 1. Batal Transaksi
      // 2. DIjalankan di hari kerja berikut (akan dimasukan ke table antrian)
    }
  }
}
