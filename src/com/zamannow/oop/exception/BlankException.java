package com.zamannow.oop.exception;

/**
 * Runtime Exception
 * dia adalah jenis exception yang tidak wajib di tangkap menggunakan try catch.
 * Kompailer Java tidak akan protes walaupun kita tidak menggunakan try catch ketika memanggil method yang bisa menyebabkan
 * runtime exception.
 * Untuk membuat class runtime exception, kita wajib mengextends class RuntimeExcepetion.
 * Ada banyak di Java yang merupakan runtime exception, seperti NullPointerException, IllegalArgumentExcption, dan lain-lain
 */
public class BlankException extends RuntimeException {
    public BlankException() {
        super();
    }

    public BlankException(String message) {
        super(message);
    }
}
