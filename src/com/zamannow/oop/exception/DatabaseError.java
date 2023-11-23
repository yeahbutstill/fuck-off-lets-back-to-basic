package com.zamannow.oop.exception;

/**
 * Error adalah jenis exception yang tidak direkomendasikan untuk di try-catch
 * Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di try-catch.
 * Artinya, direkomendasikan untuk mematikan aplikasi
 * Contoh: misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, makan direkomendasikan untuk membuat
 * Exception yang jenisnya Error dan menghentikan aplikasi
 */
public class DatabaseError extends Error {
    public DatabaseError() {
        super();
    }

    public DatabaseError(String message) {
        super(message);
    }
}
