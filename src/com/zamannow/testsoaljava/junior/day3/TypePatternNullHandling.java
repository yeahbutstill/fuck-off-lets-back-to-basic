package com.zamannow.testsoaljava.junior.day3;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.sql.SQLException;
import java.util.MissingResourceException;

public class TypePatternNullHandling {
    public static void main(String[] args) {
        run(new NullPointerException());
        run(new SQLException(new MissingResourceException("No database", null, null)));
        run(new IOException("File not found"));
        run(null);
    }

    public static void run(Throwable ex) {
        System.out.printf("%n=== %s ===%n", ex == null ? "null" : ex.getClass().getName());

        Throwable ex2 = switch (ex) {
            case IOException ioe -> new UncheckedIOException(ioe);
            case Exception __ when ex.getCause() == null -> ex.getCause();
            default -> ex;
        };

        ex2.printStackTrace();
    }
}
