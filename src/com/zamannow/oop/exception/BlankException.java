package com.zamannow.oop.exception;

public class BlankException extends RuntimeException {
  public BlankException() {
    super();
  }

  public BlankException(String message) {
    super(message);
  }
}
