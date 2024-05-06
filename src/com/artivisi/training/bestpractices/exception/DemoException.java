package com.artivisi.training.bestpractices.exception;

public class DemoException {
    public static void main(String[] args) {
        TransaksiCustomer tc = new TransaksiCustomer();
        try {
            tc.prosesPembayaranCustomer("BCA");
        } catch (TransaksiHariLiburException e) {
            e.printStackTrace();
            // tampilkan pilihan ke user :
            // 1. Batal transaksi
            // 2. Dijalankan di hari kerja berikut (akan dimasukkan ke tabel antrian)
        } catch (BankOfflineException e) {
            // tampilkan pilihan ke user :
            // 1. Batal transaksi
            // 2. Coba lagi
        }
    }
}
