package com.yeahbutstill.java21.artivisi.exception;

public class BankBelumTerdaftarException
    extends RuntimeException { // ini uncheck exception, artinya tidak wajib di try catch

  /**
   * Constructs a new runtime exception with {@code null} as its
   * detail message.  The cause is not initialized, and may subsequently be
   * initialized by a call to {@link #initCause}.
   */
  public BankBelumTerdaftarException() {
    super();
  }

  /**
   * Constructs a new runtime exception with the specified detail message.
   * The cause is not initialized, and may subsequently be initialized by a
   * call to {@link #initCause}.
   *
   * @param message the detail message. The detail message is saved for
   *                later retrieval by the {@link #getMessage()} method.
   */
  public BankBelumTerdaftarException(String message) {
    super(message);
  }
}