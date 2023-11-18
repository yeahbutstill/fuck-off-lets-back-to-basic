package com.zamannow.oop.exception;

public class ValidationException extends Throwable {
    public ValidationException() {
        super();
    }

    public ValidationException(String message) {
        super(message);
    }
}
