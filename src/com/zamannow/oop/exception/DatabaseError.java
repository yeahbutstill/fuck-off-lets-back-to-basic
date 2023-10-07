package com.zamannow.oop.exception;

public class DatabaseError extends Error {
  public DatabaseError() {
    super();
  }

  public DatabaseError(String message) {
    super(message);
  }
}
