package com.zamannow.oop.exception;

/**
 * Exception atau Error
 * Saat kita membuat aplikasi, kita tidak akan terhindar dengan yang namanya error
 * Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class exception
 * Kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh Java
 * Jika kita ingin membuat exception, maka kita harus membuat class yang extends class Throwable atau turunan-turunannya
 * Jadi semua exception parent class nya adalah class Throwable.
 *
 *
 * Membuat Exception
 * Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus ditandai
 * dengan kata kunci throws diikuti dengan class exception nya. (buat ngasih tau ke orang yang akan menggunakan method tersbut, kalau method tersebut bisa menyebabkan error)
 * Jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambahkan lebih dari satu class exception
 * Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw, diikuti dengan object exception nya
 */
public class ValidationException extends Throwable { // btw kalau yang extends throwable artinya dia checked exception ya, exception yang wajib di try catch
    public ValidationException() {
        super();
    }

    public ValidationException(String message) {
        super(message);
    }

}
